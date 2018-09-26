package com.bytatech.ayoos.patientapigateway.web.rest;

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
public class StateQueryResource {

	@Autowired
	StateResourceApi stateResourceApi;

	@GetMapping("/states")
	@Timed
	public ResponseEntity<List<StateDTO>> searchStates(@RequestParam(required = false) Long offset,
			@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer pageNumber,
			@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Boolean paged,
			@RequestParam(required = false) Integer size,
			@RequestParam(value = "sort", required = false) List<String> sort,
			@RequestParam(required = false) Boolean sortSorted, @RequestParam(required = false) Boolean sortUnsorted,
			@RequestParam(required = false) Boolean unpaged) {
		return stateResourceApi.getAllStatesUsingGET(offset, page, pageNumber, pageSize, paged, size, sort, sortSorted,
				sortUnsorted, unpaged);
	}

	@GetMapping("/states/findByCountryName")
	@Timed
	public ResponseEntity<List<StateDTO>> getAllStatesByCountryName(@RequestParam(required = false) String name,
			@RequestParam(required = false) Long offset, @RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer pageNumber, @RequestParam(required = false) Integer pageSize,
			@RequestParam(required = false) Boolean paged, @RequestParam(required = false) Integer size,
			@RequestParam(value = "sort", required = false) List<String> sort,
			@RequestParam(required = false) Boolean sortSorted, @RequestParam(required = false) Boolean sortUnsorted,
			@RequestParam(required = false) Boolean unpaged) {
		return stateResourceApi.getAllStatesByCountryNameUsingGET(name, offset, page, pageNumber, pageSize, paged, size,
				sort, sortSorted, sortUnsorted, unpaged);
	}
}