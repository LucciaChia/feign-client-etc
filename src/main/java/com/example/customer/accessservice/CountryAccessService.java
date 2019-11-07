package com.example.customer.accessservice;

import com.example.customer.client.CountryClient;
import com.example.customer.dto.CountryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryAccessService {

    private final CountryClient countryClient;

    public CountryDto getCountry(Long id) {
        return this.countryClient.getCountry(id);
    }

    public List<CountryDto> getCountries() {
        return this.countryClient.getCountryList();
    }
}
