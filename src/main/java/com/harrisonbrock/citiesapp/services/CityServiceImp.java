package com.harrisonbrock.citiesapp.services;

import com.harrisonbrock.citiesapp.domain.City;
import com.harrisonbrock.citiesapp.repositories.CityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CityServiceImp implements CityService {

    private final CityRepository repository;

    public CityServiceImp(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(City city) {
        if (city != null) {
            repository.save(city);
            log.info("Saved city: " + city.toString());
        }
        else {
            log.info("City not saved because city is null");
        }
    }
}
