package com.example.customer.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private Long customerId;
    private String name;
    private int age;
    private Long countryId;

    @Override
    public String toString() {
        return "customerId: " + this.customerId + ", name: " + this.name + ", age: " + this.age;
    }
}
