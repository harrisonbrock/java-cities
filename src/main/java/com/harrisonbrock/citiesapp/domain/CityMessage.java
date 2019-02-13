package com.harrisonbrock.citiesapp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CityMessage {
    private final String text;
    private final boolean secret;

    public CityMessage(@JsonProperty("text") String text, @JsonProperty("secret") boolean secret) {
        this.text = text;
        this.secret = secret;
    }
}
