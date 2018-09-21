package com.bytatech.ayoos.patientapigateway.web.rest;

import java.net.URISyntaxException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.payment.api.PaymentCommandResourceApi;
import com.bytatech.ayoos.patientapigateway.client.payment.model.Patch;
import com.bytatech.ayoos.patientapigateway.client.payment.model.Payment;
import com.bytatech.ayoos.patientapigateway.client.payment.model.PaymentExecutionRequest;
import com.bytatech.ayoos.patientapigateway.client.payment.model.PaymentInitiateRequest;
import com.bytatech.ayoos.patientapigateway.client.payment.model.PaymentInitiateResponse;
import com.bytatech.ayoos.patientapigateway.client.payment.model.RefundSaleRequest;
import com.bytatech.ayoos.patientapigateway.web.rest.errors.BadRequestAlertException;
import com.bytatech.ayoos.patientapigateway.web.rest.util.HeaderUtil;
import com.codahale.metrics.annotation.Timed;


@RestController
@RequestMapping("/api/command")
public class PaymentCommandResource {

	@Autowired
	private PaymentCommandResourceApi paymentCommandResourceApi;
	
	private final Logger log=LoggerFactory.getLogger(PaymentCommandResource.class);
	
	/*
	 * The method is used to Initiate a payment using the transaction details
	 * 
	 * @Parm The Payment object to create a simple payment
	 * 
	 * @Return The return object is the PaymenetInitiateResponse that is created
	 */

	@PostMapping("/paymentGateway/payments/initiate")
	public ResponseEntity<PaymentInitiateResponse> initiatePayment(@RequestBody PaymentInitiateRequest paymentInitiateRequest) {
		return paymentCommandResourceApi.initiatePaymentUsingPOST(paymentInitiateRequest);
	}

	/*
	 * The method used to execute the created payment
	 * 
	 * @Param payment id of the payment and the payment execution request
	 * 
	 * @Return return type void after updated
	 */
	@PostMapping("paymentGateway/payments/{payment_id}/execute")
	public void executePayment(@PathVariable String payment_id,
			@RequestBody(required = false) PaymentExecutionRequest paymentExecutionRequest) {
		paymentCommandResourceApi.executePaymentUsingPOST(payment_id, paymentExecutionRequest);
	}

	/*
	 * The method used to update the created payment
	 * 
	 * @Param payment id of the payment and the patch request
	 * 
	 * @Return return type void after updated
	 */
	@PatchMapping("/paymentGateway/payments/{payment_id}")
	public void updatePayment(@PathVariable String payment_id, @RequestBody List<Patch> patchRequest) {
		paymentCommandResourceApi.updatePaymentUsingPATCH(payment_id, patchRequest);
	}

	@PostMapping("/paymentGateway/payments/sale/{sale_id}/refund")
	public void refundSale(@PathVariable String sale_id, @RequestBody RefundSaleRequest refundSaleRequest) {
		paymentCommandResourceApi.refundSaleUsingPOST(sale_id, refundSaleRequest);
	}

	/* RDBMS Spec functions */

	/**
	 * POST /payments : Create a new payment.
	 *
	 * @param paymentDTO
	 *            the paymentDTO to create
	 * @return the ResponseEntity with status 201 (Created) and with body the new
	 *         paymentDTO, or with status 400 (Bad Request) if the payment has
	 *         already an ID
	 * @throws URISyntaxException
	 *             if the Location URI syntax is incorrect
	 */
	@PostMapping("/payments")
	@Timed
	public void createPayment(@RequestBody Payment payment) throws URISyntaxException {
		log.debug("REST request to save Payment : {}", payment);
		if (payment.getId() != null) {
			throw new BadRequestAlertException("A new payment cannot already have an ID", "payment", "idexists");
		}
		paymentCommandResourceApi.createPaymentUsingPOST(payment);

	}

	/**
	 * PUT /payments : Updates an existing payment.
	 *
	 * @param paymentDTO
	 *            the paymentDTO to update
	 * @return the ResponseEntity with status 200 (OK) and with body the updated
	 *         paymentDTO, or with status 400 (Bad Request) if the paymentDTO is not
	 *         valid, or with status 500 (Internal Server Error) if the paymentDTO
	 *         couldn't be updated
	 * @throws URISyntaxException
	 *             if the Location URI syntax is incorrect
	 */
	@PutMapping("/payments")
	@Timed
	public void updatePayment(@RequestBody Payment payment) throws URISyntaxException {
		log.debug("REST request to update Payment : {}", payment);
		if (payment.getId() == null) {
			createPayment(payment);
		} else {
			paymentCommandResourceApi.createPaymentUsingPOST(payment);
		}
	}

	/**
	 * DELETE /payments/:id : delete the "id" payment.
	 *
	 * @param id
	 *            the id of the paymentDTO to delete
	 * @return the ResponseEntity with status 200 (OK)
	 */
	@DeleteMapping("/payments/{id}")
	@Timed
	public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
		log.debug("REST request to delete Payment : {}", id);
		paymentCommandResourceApi.deletePaymentUsingDELETE(id);
		return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert("payment", id.toString())).build();
	}
	
}
