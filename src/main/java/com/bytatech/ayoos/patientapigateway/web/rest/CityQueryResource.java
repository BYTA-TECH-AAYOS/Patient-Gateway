package com.bytatech.ayoos.patientapigateway.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.patient.api.CityResourceApi;
import com.bytatech.ayoos.patientapigateway.client.patient.model.CityDTO;
import com.codahale.metrics.annotation.Timed;

/**
 * REST controller for managing City
 */
@RestController
@RequestMapping("/api")
public class CityQueryResource {

	@Autowired
	CityResourceApi cityResourceApi;

	@GetMapping("/cities")
	@Timed
	public ResponseEntity<List<CityDTO>> searchCities(@RequestParam(required = false) Long offset,
			@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer pageNumber,
			@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Boolean paged,
			@RequestParam(required = false) Integer size,
			@RequestParam(value = "sort", required = false) List<String> sort,
			@RequestParam(required = false) Boolean sortSorted, @RequestParam(required = false) Boolean sortUnsorted,
			@RequestParam(required = false) Boolean unpaged) {
		return cityResourceApi.getAllCitiesUsingGET(offset, page, pageNumber, pageSize, paged, size, sort, sortSorted,
				sortUnsorted, unpaged);
	}

	@GetMapping("/cities/findByStateName")
	@Timed
	public ResponseEntity<List<CityDTO>> getAllCitiesByStateName(@RequestParam(required = false) String name,
			@RequestParam(required = false) Long offset, @RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer pageNumber, @RequestParam(required = false) Integer pageSize,
			@RequestParam(required = false) Boolean paged, @RequestParam(required = false) Integer size,
			@RequestParam(value = "sort", required = false) List<String> sort,
			@RequestParam(required = false) Boolean sortSorted, @RequestParam(required = false) Boolean sortUnsorted,
			@RequestParam(required = false) Boolean unpaged) {
		return cityResourceApi.getAllCitiesByStateNameUsingGET(name, offset, page, pageNumber, pageSize, paged, size,
				sort, sortSorted, sortUnsorted, unpaged);
	}

}