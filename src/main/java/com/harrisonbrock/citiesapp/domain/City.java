package com.harrisonbrock.citiesapp.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String state;
    private String city;
    private double housePrice;

    public City() {
    }

    public City(String state, String city, double housePrice) {
        this.state = state;
        this.city = city;
        this.housePrice = housePrice;
    }
}
