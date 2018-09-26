package com.bytatech.ayoos.patientapigateway.repository.search;



import java.util.Set;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.bytatech.ayoos.patientapigateway.doctor.model.Doctor;



/**
 * Spring Data Elasticsearch repository for the Doctor entity.
 */
public interface DoctorSearchRepository extends ElasticsearchRepository<Doctor, Long> {
	/* @Query("{\"bool\" : {\"must\" : [{\"match\" : {\"profile.doctorName\" : \"?0\"}}]}}")
	 Set<Doctor> findBySpecial(String doctorName);*/

	/* @Query("{\"bool\": {\"must\": [{\"match\": {\"authors.name\": \"?0\"}}]}}")
	 Set<Doctor> findBySpeciay(String name, Pageable pageable);*/
     
	
	
	
	
}
