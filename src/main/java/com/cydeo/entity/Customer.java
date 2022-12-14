package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Customer {

    //primary key will be auto generated by postgres
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identity is for the postgres
    private Long id;

    private String firstName;
    private String lastName;
    private String userName;
    private String email;




}
