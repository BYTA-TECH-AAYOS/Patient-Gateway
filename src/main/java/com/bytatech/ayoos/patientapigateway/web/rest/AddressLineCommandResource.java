package com.bytatech.ayoos.patientapigateway.web.rest;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.patient.api.AddressLineResourceApi;
import com.bytatech.ayoos.patientapigateway.client.patient.model.AddressLineDTO;
import com.codahale.metrics.annotation.Timed;

/**
 * REST controller for managing AddressLine.
 */
@RestController
@RequestMapping("/api")
public class AddressLineCommandResource {

  
    @Autowired
    AddressLineResourceApi addressLineResourceApi;
    
    
    /**
     * POST  /address-lines : Create a new addressLine.
     *
     * @param addressLineDTO the addressLineDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new addressLineDTO, or with status 400 (Bad Request) if the addressLine has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/address-lines")
    @Timed
    public ResponseEntity<AddressLineDTO> createAddressLine(@RequestBody AddressLineDTO addressLineDTO) throws URISyntaxException {
       
    	return addressLineResourceApi.createAddressLineUsingPOST(addressLineDTO);
    }

    /**
     * PUT  /address-lines : Updates an existing addressLine.
     *
     * @param addressLineDTO the addressLineDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated addressLineDTO,
     * or with status 400 (Bad Request) if the addressLineDTO is not valid,
     * or with status 500 (Internal Server Error) if the addressLineDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/address-lines")
    @Timed
    public ResponseEntity<AddressLineDTO> updateAddressLine(@RequestBody AddressLineDTO addressLineDTO) throws URISyntaxException {

    	return addressLineResourceApi.updateAddressLineUsingPUT(addressLineDTO);
    }

    /**
     * DELETE  /address-lines/:id : delete the "id" addressLine.
     *
     * @param id the id of the addressLineDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/address-lines/{id}")
    @Timed
    public ResponseEntity<Void> deleteAddressLine(@PathVariable Long id) {
      
    	return addressLineResourceApi.deleteAddressLineUsingDELETE(id);
    
    }

   
}
