package com.bytatech.ayoos.patientapigateway.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.patient.api.CityResourceApi;

/**
 * REST controller for managing City
 */
@RestController
@RequestMapping("/api")
public class CityQueryResource{
	
	@Autowired
	CityResourceApi cityResourceApi;
	
	
	
}