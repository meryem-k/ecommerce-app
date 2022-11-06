package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identity is for the postgres
    private Long id;

    private BigDecimal amount;

    @OneToOne
    private Customer customer;//customer foreign key

}
