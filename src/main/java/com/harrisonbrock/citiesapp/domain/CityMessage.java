package com.harrisonbrock.citiesapp.domain;

import lombok.Data;

@Data
public class CityMessage {
    private final String text;
    private final boolean secret;

    public CityMessage(String text, boolean secret) {
        this.text = text;
        this.secret = secret;
    }
}
