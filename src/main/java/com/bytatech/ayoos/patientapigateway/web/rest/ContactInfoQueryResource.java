package com.bytatech.ayoos.patientapigateway.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.patientapigateway.client.patient.api.ContactInfoResourceApi;
import com.bytatech.ayoos.patientapigateway.client.patient.model.ContactInfoDTO;
import com.codahale.metrics.annotation.Timed;

/**
 * REST controller for managing ContactInfo.
 */
@RestController
@RequestMapping("/api")
public class ContactInfoQueryResource {

   
    @Autowired
    ContactInfoResourceApi contactInfoResourceApi;
    
    /**
     * SEARCH  /_search/contact-infos?query=:query : search for the contactInfo corresponding
     * to the query.
     *
     * @param query the query of the contactInfo search
     * @param pageable the pagination information
     * @return the result of the search
     */
    @GetMapping("/_search/contact-infos")
    @Timed
    public ResponseEntity<List<ContactInfoDTO>> searchContactInfos(@RequestParam String query,int page, int size, ArrayList<String> sort) {
     
    	return null;

}
    
}
