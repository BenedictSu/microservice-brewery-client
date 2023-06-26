package com.brewery.microservicebreweryclient.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID      uuid;
    private String    beerName;
    private BeerStyle beerStyle;
    private Long      universalProductCode;
}