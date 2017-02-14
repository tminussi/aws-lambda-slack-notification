package br.com.bluesoft.model.factory;

import br.com.bluesoft.model.News;
import br.com.bluesoft.model.SlackWebHook;
import br.com.bluesoft.model.SlackWebHook.SlackWebHookBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import static br.com.bluesoft.constants.URLsEndpoints.ENDPOINTS_LIST;

public class SlackWebHookFactory {


    public static SlackWebHook create() {
        ObjectMapper objectMapper = new ObjectMapper();

        List<News> newsList = ENDPOINTS_LIST.stream()
                .map(url -> {
                    try {
                        return objectMapper.readValue(new URL(url), News.class);
                    } catch (IOException e) {
                        return new News();
                    }
                }).collect(Collectors.toList());

        return new SlackWebHookBuilder()
                .withUsername()
                .withText()
                .withIconEmoji()
                .withAttachments(newsList)
                .build();

    }
}
