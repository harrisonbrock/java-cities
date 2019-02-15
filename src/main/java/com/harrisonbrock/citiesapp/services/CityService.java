package com.harrisonbrock.citiesapp.services;

import com.harrisonbrock.citiesapp.domain.City;

import java.util.List;

public interface CityService {
    void save(City city);
    List<City> findAll();

}
