package com.example.customer.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private Long customerId;
    private String name;
    private int age;
    private Long countryId;

//    public CustomerDto() {
//    }
//
//    public CustomerDto(Long customerId, String name, int age) {
//        this.customerId = customerId;
//        this.name = name;
//        this.age = age;
//    }
//
//    public Long getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(Long customerId) {
//        this.customerId = customerId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "customerId: " + this.customerId + ", name: " + this.name + ", age: " + this.age;
    }
}
