package com.bytatech.ayoos.patientapigateway.client.patient.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.patientapigateway.client.patient.ClientConfiguration;

@FeignClient(name="${patient.name:patient}", url="${patient.url:104.196.121.188:8085/}", configuration = ClientConfiguration.class)
public interface MedicalReferenceResourceApiClient extends MedicalReferenceResourceApi {
}