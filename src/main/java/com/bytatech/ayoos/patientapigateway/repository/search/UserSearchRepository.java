package com.bytatech.ayoos.patientapigateway.repository.search;

import com.bytatech.ayoos.patientapigateway.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {
}
