package com.bytatech.ayoos.patientapigateway.web.rest;

import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.appointment.model.TaskRequest;
import com.codahale.metrics.annotation.Timed;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.AdditionalInformationRequest;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.AppointmentConfirmationRequest;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.AppointmentConfirmationResponse;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.AppointmentDTO;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.ConsultationDetails;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.DoctorInfo;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.PatientInfo;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.PaymentConfirmationRequest;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.ProcessPayment;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.Slot;

import com.bytatech.ayoos.patientapigateway.client.appointment.api.AppointmentCommandResourceApi;
import com.bytatech.ayoos.patientapigateway.client.appointment.model.AppointmentRequest;

@RestController 
@RequestMapping("/api/command")
public class AppointmentCommandResource {

	private final Logger log=LoggerFactory.getLogger(AppointmentCommandResource.class);
	
	@Autowired
	private AppointmentCommandResourceApi appointmentCommandResourceApi;
	
	@PostMapping("/initiateAppointment")
	public void initiateAppointment(@RequestBody AppointmentRequest appointmentRequest) {
		log.info("Appointment request to initate the appointment "+appointmentRequest);
		appointmentCommandResourceApi.initiateAppointmentUsingPOST(appointmentRequest);
	}
	

	 @PostMapping("/chooseDoctor/{taskId}")
	    public void chooseDoctor(@PathVariable String taskId,@RequestBody DoctorInfo doctorInfo) {
	    	
		 appointmentCommandResourceApi.chooseDoctorUsingPOST(taskId,doctorInfo);
	    }
	    
	    @PostMapping("/chooseSlot/{taskId}")
	    public void selectSlot(@PathVariable String taskId,@RequestBody Slot slotSelectionRequest) {
	    	
	    	appointmentCommandResourceApi.selectSlotUsingPOST(taskId,slotSelectionRequest);
	    }
	    
	    @PostMapping("/confirmRegistartion/{taskId}")
	    public void confirmRegistration(@PathVariable String taskId) {
	    	appointmentCommandResourceApi.confirmRegistrationUsingPOST(taskId);
	    }
	    
	    @PostMapping("/sendAppointmentRequest/{taskId}")
	    public void sendAppointmentRequest(@PathVariable String taskId,@RequestBody AppointmentConfirmationRequest appointmentConfirmationRequest) {
	    	appointmentCommandResourceApi.sendAppointmentRequestUsingPOST(taskId,appointmentConfirmationRequest);
	    }
	   
	    @PostMapping("/processAppointmentRequest/{taskId}")
	    public void processAppointmentRequest(@PathVariable String taskId,@RequestBody AppointmentConfirmationResponse appointmentConfirmationResponse) {
	    	appointmentCommandResourceApi.processAppointmentRequestUsingPOST(taskId,appointmentConfirmationResponse);
	    }
	    
	    @PostMapping("/confirmPayment/{taskId}")
	    public void confirmPayment(@PathVariable String taskId,@RequestBody PaymentConfirmationRequest paymentConfirmationRequest) {
	    	
	    	appointmentCommandResourceApi.confirmPaymentUsingPOST(taskId,paymentConfirmationRequest);
	    	
	    }
	    
	    @PostMapping("/processPayment/{taskId}")
	    public void processPayment(@PathVariable String taskId,@RequestBody ProcessPayment processPayment) {
	    	
	    	appointmentCommandResourceApi.processPaymentUsingPOST(taskId,processPayment);
	    }
	    
	    @PostMapping("/additionalInformationRequest/{taskId}")
	    public void additionalInformationRequest(@PathVariable String taskId,@RequestBody AdditionalInformationRequest additionalInformationRequest ) {
	    	appointmentCommandResourceApi.additionalInformationRequestUsingPOST(taskId,additionalInformationRequest);
	    }
	    
	    @PostMapping("/collectAdditionalDetails/{taskId}")
	    public void collectAdditionalDetails(@PathVariable String taskId,@RequestBody ConsultationDetails symptomDetails) {
	    	
	    	appointmentCommandResourceApi.collectAdditionalDetailsUsingPOST(taskId,symptomDetails);
	    	
	    }
	    
	    @PutMapping("/updateTask/{taskId}")
	    public void updateTask(@PathVariable String taskId,@RequestBody TaskRequest taskRequest) {
	   
	    	appointmentCommandResourceApi.updateTaskUsingPUT(taskId,taskRequest);
	    }
	    
	    @PutMapping("/updatePatientInfo/{processInstanceId}")
	    public void updatePatientInfo(@RequestBody PatientInfo patientInfo,@PathVariable String processInstanceId) {
	    	appointmentCommandResourceApi.updatePatientInfoUsingPUT(processInstanceId, patientInfo);
	    }
	    
	 
	    @PostMapping("/appointments")
	    @Timed
	    public ResponseEntity<AppointmentDTO> createAppointment(@RequestBody AppointmentDTO appointmentDTO)  {
	        log.debug("REST request to save Appointment : {}", appointmentDTO);
	        return appointmentCommandResourceApi.createAppointmentUsingPOST(appointmentDTO);
	    }

	    
	    @PutMapping("/appointments")
	    @Timed
	    public ResponseEntity<AppointmentDTO> updateAppointment(@RequestBody AppointmentDTO appointmentDTO) throws URISyntaxException {
	        log.debug("REST request to update Appointment : {}", appointmentDTO);
	    
	        return appointmentCommandResourceApi.updateAppointmentUsingPUT(appointmentDTO);
	    }

	    
	  
	    @DeleteMapping("/appointments/{id}")
	    @Timed
	    public ResponseEntity<Void> deleteAppointment(@PathVariable Long id) {
	        log.debug("REST request to delete Appointment : {}", id);
	        return appointmentCommandResourceApi.deleteAppointmentUsingDELETE(id);
	    }
	    
	
	
	
}
