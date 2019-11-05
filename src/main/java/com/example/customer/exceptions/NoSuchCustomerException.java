package com.example.customer.exceptions;

import java.util.NoSuchElementException;

public class NoSuchCustomerException extends NoSuchElementException {

    public NoSuchCustomerException(long id) {
        super("Customer with customerId " + id + " not found");
    }
}
