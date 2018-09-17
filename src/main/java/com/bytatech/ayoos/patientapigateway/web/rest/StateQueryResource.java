package com.bytatech.ayoos.patientapigateway.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.patient.api.StateResourceApi;
import com.bytatech.ayoos.patientapigateway.client.patient.model.StateDTO;
import com.codahale.metrics.annotation.Timed;

/**
 * REST controller for managing State.
 */
@RestController
@RequestMapping("/api")
public class StateQueryResource{
	
	@Autowired
	StateResourceApi stateResourceApi;
	
    @GetMapping("/_search/states")
    @Timed
    public ResponseEntity<List<StateDTO>> searchStates(@RequestParam String query,int page, int size, ArrayList<String> sort) {
     
    	//return patientResourceApi.searchPatientsUsingGET(query, offset, page, pageNumber, pageSize, paged, size, sort, sortSorted, sortUnsorted, unpaged)
    	return null;
    }
	
}