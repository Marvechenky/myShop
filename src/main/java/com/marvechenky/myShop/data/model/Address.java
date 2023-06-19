package com.marvechenky.myShop.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Address {

    @Column(name= "house_number")
    private String houseNumber;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "city_name")
    private String city;
    @Column(name = "state_name")
    private String state;
    @Column(name = "postal_code")
    private String postalCode;

}
