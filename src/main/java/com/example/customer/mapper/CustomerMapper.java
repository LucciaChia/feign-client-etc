package com.example.customer.mapper;

import com.example.customer.domain.Customer;
import com.example.customer.dto.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
