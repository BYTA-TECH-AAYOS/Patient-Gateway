package com.bytatech.ayoos.patientapigateway.client.payment.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.patientapigateway.client.payment.ClientConfiguration;

@FeignClient(name="${payment.name:payment}", url="${payment.url:104.196.121.188:8087/}", configuration = ClientConfiguration.class)
public interface PayeeResourceApiClient extends PayeeResourceApi {
}