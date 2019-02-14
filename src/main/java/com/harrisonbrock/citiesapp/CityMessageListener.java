package com.harrisonbrock.citiesapp;

import com.harrisonbrock.citiesapp.domain.CityMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CityMessageListener {
    @RabbitListener(queues = {
            CitiesappApplication.QUEUE_CITY1,
            CitiesappApplication.QUEUE_CITY2,
            CitiesappApplication.QUEUE_SECRET})
    public void receiveMessage(CityMessage cm) {
        log.info("Received Message: {} ", cm.toString());

    }
}
