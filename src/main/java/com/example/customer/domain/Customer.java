package com.example.customer.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private int age;
    private Long countryId;

    @ManyToMany
    @JoinTable(name = "CustomerTag", joinColumns = @JoinColumn(name = "CustomerId"),
                inverseJoinColumns = @JoinColumn(name = "TagId"))
    private Set<Tag> tags = new HashSet<>();

    public Customer() {
    }

    public Customer(Long customerId, String name, int age) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
    }

}
