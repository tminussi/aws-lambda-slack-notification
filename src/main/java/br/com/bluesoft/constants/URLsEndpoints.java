package br.com.bluesoft.constants;

import java.util.List;

import static java.util.Arrays.asList;

public class URLsEndpoints {

    private static final String HACKER_NEWS = "https://newsapi.org/v1/articles?source=hacker-news&apiKey=766c6927e4f14b00ad566899afbab0e5";
    private static final String ARS_TECHNICA = "https://newsapi.org/v1/articles?source=ars-technica&apiKey=766c6927e4f14b00ad566899afbab0e5";
    private static final String NEW_SCIENTIST = "https://newsapi.org/v1/articles?source=new-scientist&apiKey=766c6927e4f14b00ad566899afbab0e5";
    private static final String TECH_CRUNCH = "https://newsapi.org/v1/articles?source=tech-crunch&apiKey=766c6927e4f14b00ad566899afbab0e5";
    private static final String THE_NEXT_WEB = "https://newsapi.org/v1/articles?source=the-next-web&apiKey=766c6927e4f14b00ad566899afbab0e5";

    public static final List<String> ENDPOINTS_LIST = asList(HACKER_NEWS, ARS_TECHNICA, NEW_SCIENTIST, TECH_CRUNCH, THE_NEXT_WEB);

}
