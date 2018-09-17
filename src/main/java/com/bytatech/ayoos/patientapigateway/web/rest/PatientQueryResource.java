package com.bytatech.ayoos.patientapigateway.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class PatientQueryResource {

	@Autowired
	PatientResourceApi patientResourceApi;

	@GetMapping("/patients/{id}")
	@Timed
	public ResponseEntity<PatientDTO> getPatientById(@PathVariable Long id) {

		return patientResourceApi.getPatientUsingGET(id);

	}
}
