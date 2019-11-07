package com.example.customer.controllers;

import com.example.customer.accessservice.CountryAccessService;
import com.example.customer.config.SwaggerConfig;
import com.example.customer.domain.Customer;
import com.example.customer.dto.CountryDto;
import com.example.customer.dto.CustomerDto;
import com.example.customer.facade.CustomerFacade;
import com.example.customer.mapper.CustomerMapper;
import com.example.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Import(SwaggerConfig.class)
@RequiredArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final CustomerFacade customerFacade;

    private final CountryAccessService countryAccessService;

    @GetMapping("/{id}")
    public CustomerDto findCustomerDto(@PathVariable Long id) {

        System.out.println(countryAccessService.getCountry(id).getCountryId());
        System.out.println(countryAccessService.getCountry(id).getName());
        System.out.println("*****");


        List<CountryDto> countryDtoList = countryAccessService.getCountries();
        countryDtoList.forEach(item -> System.out.println(item.getCountryId() + ": " + item.getName()));
        System.out.println("-----------");

        return customerFacade.findCustomerById(id);


    }

}
