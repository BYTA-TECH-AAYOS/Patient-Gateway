package com.bytatech.ayoos.patientapigateway.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.patient.api.LocationResourceApi;
import com.bytatech.ayoos.patientapigateway.client.patient.model.LocationDTO;
import com.codahale.metrics.annotation.Timed;

/**
 * REST controller for managing Location.
 */
@RestController
@RequestMapping("/api")
public class LocationQueryResource {

    private final Logger log = LoggerFactory.getLogger(LocationQueryResource.class);

    @Autowired
    LocationResourceApi locationResourceApi;
    
    /**
     * SEARCH  /_search/locations?query=:query : search for the location corresponding
     * to the query.
     *
     * @param query the query of the location search
     * @param pageable the pagination information
     * @return the result of the search
     */
    @GetMapping("/_search/locations")
    @Timed
    public ResponseEntity<List<LocationDTO>> searchLocations(@RequestParam String query,int page, int size, ArrayList<String> sort) {
     
    	
    	return null;
    }

}
