package com.cydeo.entity;

import com.cydeo.enums.PaymentMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Payment extends BaseEntity{

    private BigDecimal paidPrice;

    @Enumerated(value = EnumType.STRING)
    private PaymentMethod paymentMethod;





}
