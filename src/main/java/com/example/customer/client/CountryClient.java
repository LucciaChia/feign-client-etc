package com.example.customer.client;

import com.example.customer.dto.CountryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@FeignClient(name = "country", url = "http://localhost:8080/")
@RequestMapping(path = "/countries")
public interface CountryClient {

    @GetMapping(value = "/country/{countryId}")
    CountryDto getCountry(@PathVariable Long countryId);
}
