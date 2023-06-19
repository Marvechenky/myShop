package com.marvechenky.myShop.data.model;

import com.marvechenky.myShop.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String name;
    private String description;

    @Enumerated(value = EnumType.STRING)
    private Category category;

    private BigDecimal price;

    @Column(name = "product_quantity")
    private Integer quantity;
}
