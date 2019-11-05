package com.example.customer.service;

import com.example.customer.domain.Customer;
import com.example.customer.exceptions.NoSuchCustomerException;
import com.example.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer findCustomerById(long id) {
        log.trace("findCustomerById {}", id);

        return customerRepository.findById(id).orElseThrow(() -> {
            log.error("Tag with customerId {} not found.", id);
            return new NoSuchCustomerException(id);
        });
    }
}
