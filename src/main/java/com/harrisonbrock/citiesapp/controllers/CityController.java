package com.harrisonbrock.citiesapp.controllers;

import com.harrisonbrock.citiesapp.CitiesappApplication;
import com.harrisonbrock.citiesapp.domain.City;
import com.harrisonbrock.citiesapp.services.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@Slf4j
@RestController
public class CityController {

    private final CityService cityService;
    private final RabbitTemplate rabbitTemplate;

    public CityController(CityService cityService, RabbitTemplate rabbitTemplate) {
        this.cityService = cityService;
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping("/cities/afford")
    public void getCities() {
        List<City> cities = cityService.findAll();
        for (City city : cities) {

            boolean rand = new Random().nextBoolean();

            log.info("Sending Messages....");

            if (rand) {

                rabbitTemplate.convertAndSend(CitiesappApplication.QUEUE_SECRET);
            } else if (city.getIndex() < 6) {
                rabbitTemplate.convertAndSend(CitiesappApplication.QUEUE_CITY1);
            } else {
                rabbitTemplate.convertAndSend(CitiesappApplication.QUEUE_CITY2);
            }
        }
    }
}
