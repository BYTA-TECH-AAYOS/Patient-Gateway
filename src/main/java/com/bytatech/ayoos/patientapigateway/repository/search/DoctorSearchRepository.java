package com.bytatech.ayoos.patientapigateway.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;

import com.bytatech.ayoos.patientapigateway.doctor.model.Doctor;

/**
 * Spring Data Elasticsearch repository for the Doctor entity.
 */
public interface DoctorSearchRepository extends ElasticsearchRepository<Doctor, Long> {
	/*
	 * @Query("{\"bool\" : {\"must\" : [{\"match\" : {\"profile.doctorName\" : \"?0\"}}]}}"
	 * ) Set<Doctor> findBySpecial(String doctorName);
	 */

	/*
	 * @Query("{\"bool\": {\"must\": [{\"match\": {\"authors.name\": \"?0\"}}]}}"
	 * ) Set<Doctor> findBySpeciay(String name, Pageable pageable);
	 */

	Page<Doctor> findByLocationNear(Point point, Distance value, Pageable pageable);

}
