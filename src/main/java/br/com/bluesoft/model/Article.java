package br.com.bluesoft.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

    @JsonProperty(value = "title")
    private String title;

    @JsonProperty(value = "url")
    private String value;
}
