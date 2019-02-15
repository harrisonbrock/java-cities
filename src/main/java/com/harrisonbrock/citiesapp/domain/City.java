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
    private String location;
    private double housePrice;
    private int index;

    public City() {
    }

    public City(String location, double housePrice, int index) {
        this.location = location;
        this.housePrice = housePrice;
        this.index = index;
    }
}
