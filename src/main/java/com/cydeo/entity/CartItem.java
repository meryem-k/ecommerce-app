package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Data

public class CartItem extends BaseEntity {


    private Integer quantity;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Cart cart;



}
