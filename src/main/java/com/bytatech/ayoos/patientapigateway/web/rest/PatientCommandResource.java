package com.bytatech.ayoos.patientapigateway.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.patient.api.PatientResourceApi;
import com.bytatech.ayoos.patientapigateway.client.patient.model.PatientDTO;
import com.codahale.metrics.annotation.Timed;

/**
 * REST controller for managing Patient.
 */
@RestController
@RequestMapping("/api")
public class PatientCommandResource {
	
	
	private final Logger log = LoggerFactory.getLogger(PatientCommandResource.class);
	
	@Autowired
	PatientResourceApi patientResourceApi;
	
	
    @PostMapping("/patients/registerPatient")
    @Timed
    public void createPatient(@RequestBody PatientDTO patientDTO) {
    	
    	log.info("**********************  Entered register patient");
    	  	
    	patientResourceApi.createPatientUsingPOST(patientDTO);
    	
    }

    
    @PutMapping("/patients/updateProfile")
    @Timed
    public void updatePatient(@RequestBody PatientDTO patientDTO) {
       
    	patientResourceApi.updatePatientUsingPUT(patientDTO);
    	
    }


    @DeleteMapping("/patients/deletePatient/{id}")
    @Timed
    public void deletePatient(@PathVariable Long id) {
    
    	patientResourceApi.deletePatientUsingDELETE(id);
    
    }


}
