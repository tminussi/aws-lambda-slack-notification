package br.com.bluesoft.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class News {

    @JsonProperty(value = "articles")
    private List<Article> fields;
}
