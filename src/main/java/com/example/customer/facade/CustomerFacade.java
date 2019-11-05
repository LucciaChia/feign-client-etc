package com.example.customer.facade;

import com.example.customer.domain.Customer;
import com.example.customer.dto.CustomerDto;
import com.example.customer.mapper.CustomerMapper;
import com.example.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerFacade {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    public CustomerDto findCustomerById(long id) {
        Customer customer = customerService.findCustomerById(id);
        return customerMapper.customerToCustomerDto(customer);
    }
}
