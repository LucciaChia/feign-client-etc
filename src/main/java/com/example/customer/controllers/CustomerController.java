package com.example.customer.controllers;

import com.example.customer.config.SwaggerConfig;
import com.example.customer.domain.Customer;
import com.example.customer.dto.CustomerDto;
import com.example.customer.facade.CustomerFacade;
import com.example.customer.mapper.CustomerMapper;
import com.example.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;

//@Import(SwaggerConfig.class)
@RequiredArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final CustomerFacade customerFacade;

    @GetMapping("/{id}")
    public CustomerDto findCustomerDto(@PathVariable Long id) {

        return customerFacade.findCustomerById(id);

    }

}
