package com.bytatech.ayoos.patientapigateway.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.payment.api.PaymentQueryResourceApi;
import com.bytatech.ayoos.patientapigateway.client.payment.model.PaymentDTO;
import com.bytatech.ayoos.patientapigateway.client.payment.model.PaymentDetails;
import com.bytatech.ayoos.patientapigateway.client.payment.model.PaymentHistory;
import com.codahale.metrics.annotation.Timed;



@RestController
@RequestMapping("/api/query")

public class PaymentQueryResource {
private final Logger log=LoggerFactory.getLogger(PaymentQueryResource.class);
	
	@Autowired
	private PaymentQueryResourceApi paymentqueryResourceApi;
	
	/*
	 * The method return the list of payments
	 * 
	 * @Return returns the PaymentHistory object
	 */

	@GetMapping("/paymentGateway/payments")
	public ResponseEntity<PaymentHistory> getAllPaymentsFromGateway() {
		return paymentqueryResourceApi.getAllPaymentsFromGatewayUsingGET();
	}
	
	/*
	 * The method return the specified payment by search using payment id
	 * 
	 * @Param the payment id of the specified payment
	 * 
	 * @Return return the payment object
	 */
	@GetMapping("/paymentGateway/payments/{payment_id}")
	public ResponseEntity<PaymentDetails> getPayment(@PathVariable String payment_id) {
		return paymentqueryResourceApi.getPaymentUsingGET(payment_id);
	}
	
				/*RDBMS Spec Functions*/
	
	/**
     * GET  /payments : get all the payments.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of payments in body
     */
    @GetMapping("/payments")
    @Timed
    public ResponseEntity<List<PaymentDTO>> getAllPayments(@RequestParam(required=false)Long offset,@RequestParam(required=false)Integer page,@RequestParam(required=false)Integer pageNumber,@RequestParam(required=false)Integer pageSize,@RequestParam(required=false)Boolean paged,@RequestParam(required=false)Integer size,@RequestParam(required=false)List<String> sort,@RequestParam(required=false)Boolean sortSorted,@RequestParam(required=false)Boolean sortUnsorted,@RequestParam(required=false)Boolean unpaged) {
        log.debug("REST request to get a page of Payments");
       return paymentqueryResourceApi.getAllPaymentsUsingGET(offset, page, pageNumber, pageSize, paged, size, sort, sortSorted, sortUnsorted, unpaged);
    
    }

    /**
     * GET  /payments/:id : get the "id" payment.
     *
     * @param id the id of the paymentDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the paymentDTO, or with status 404 (Not Found)
     */
    @GetMapping("/payments/{id}")
    @Timed
    public ResponseEntity<PaymentDTO> getPayment(@PathVariable Long id) {
        log.debug("REST request to get Payment : {}", id);
        return paymentqueryResourceApi.getPaymentUsingGET1(id);
    }

   
    /**
     * SEARCH  /_search/payments?query=:query : search for the payment corresponding
     * to the query.
     *
     * @param query the query of the payment search
     * @param pageable the pagination information
     * @return the result of the search
     */
    @GetMapping("/_search/payments")
    @Timed
    public ResponseEntity<List<PaymentDTO>> searchPayments(String query,@RequestParam(required=false)Long offset,@RequestParam(required=false)Integer page,@RequestParam(required=false)Integer pageNumber,@RequestParam(required=false)Integer pageSize,@RequestParam(required=false)Boolean paged,@RequestParam(required=false)Integer size,@RequestParam(required=false)List<String> sort,@RequestParam(required=false)Boolean sortSorted,@RequestParam(required=false)Boolean sortUnsorted,@RequestParam(required=false)Boolean unpaged) {
        log.debug("REST request to search for a page of Payments for query {}", query);
       return paymentqueryResourceApi.searchPaymentsUsingGET(query, offset, page, pageNumber, pageSize, paged, size, sort, sortSorted, sortUnsorted, unpaged);
        
    }

	
}
