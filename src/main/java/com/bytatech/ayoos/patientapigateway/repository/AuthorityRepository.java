package com.bytatech.ayoos.patientapigateway.repository;

import com.bytatech.ayoos.patientapigateway.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
