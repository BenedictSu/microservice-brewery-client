package com.brewery.microservicebreweryclient.web.client;

import com.brewery.microservicebreweryclient.web.model.BeerDtoV2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class BreweryClient {

    public final  String       BEER_PATH = "/api/v2/beer/";
    @Value("${microservice.brewery.apiHost}")
    private       String       apiHost;
    private final RestTemplate restTemplate;

    public BreweryClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public BeerDtoV2 getBeerById(UUID uuid) {
        return restTemplate.getForObject(apiHost + BEER_PATH + uuid, BeerDtoV2.class);
    }
}
