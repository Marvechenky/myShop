package com.marvechenky.myShop.data.model;

import com.marvechenky.myShop.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long OrderId;
    private BigDecimal amount;

    @Enumerated(value = EnumType.STRING)
    private PaymentStatus status;
}
