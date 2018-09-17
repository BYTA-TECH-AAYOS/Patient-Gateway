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

import com.bytatech.ayoos.patientapigateway.client.patient.api.ContactInfoResourceApi;
import com.bytatech.ayoos.patientapigateway.client.patient.model.ContactInfoDTO;
import com.codahale.metrics.annotation.Timed;

/**
 * REST controller for managing ContactInfo.
 */
@RestController
@RequestMapping("/api")
public class ContactInfoCommandResource {

	@Autowired
	ContactInfoResourceApi contactInfoResourceApi;

    /**
     * POST  /contact-infos : Create a new contactInfo.
     *
     * @param contactInfoDTO the contactInfoDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new contactInfoDTO, or with status 400 (Bad Request) if the contactInfo has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/contact-infos")
    @Timed
    public ResponseEntity<ContactInfoDTO> createContactInfo(@RequestBody ContactInfoDTO contactInfoDTO) throws URISyntaxException {
      
    	return contactInfoResourceApi.createContactInfoUsingPOST(contactInfoDTO);
    	
    }

    /**
     * PUT  /contact-infos : Updates an existing contactInfo.
     *
     * @param contactInfoDTO the contactInfoDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated contactInfoDTO,
     * or with status 400 (Bad Request) if the contactInfoDTO is not valid,
     * or with status 500 (Internal Server Error) if the contactInfoDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/contact-infos")
    @Timed
    public ResponseEntity<ContactInfoDTO> updateContactInfo(@RequestBody ContactInfoDTO contactInfoDTO) throws URISyntaxException {
        
    	return contactInfoResourceApi.updateContactInfoUsingPUT(contactInfoDTO);
    }

     /**
     * DELETE  /contact-infos/:id : delete the "id" contactInfo.
     *
     * @param id the id of the contactInfoDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/contact-infos/{id}")
    @Timed
    public ResponseEntity<Void> deleteContactInfo(@PathVariable Long id) {
     
    	return contactInfoResourceApi.deleteContactInfoUsingDELETE(id);
    }

}
