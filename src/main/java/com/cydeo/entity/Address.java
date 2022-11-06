package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identity is for the postgres
    private Long id;

    private String name;
    private String street;
    private String zipCode;


    //many addresses can have one customer
    @ManyToOne
    private Customer customer;
}
