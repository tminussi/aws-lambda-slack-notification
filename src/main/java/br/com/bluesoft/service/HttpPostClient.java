package br.com.bluesoft.service;

import br.com.bluesoft.model.SlackWebHook;
import com.google.gson.Gson;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class HttpPostClient {

    private static final String SLACK_ENDPOINT = "your-slack-endpoint-here";

    public static void executePostRequest(SlackWebHook slackWebHook) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(SLACK_ENDPOINT);

        StringEntity entity = new StringEntity(new Gson().toJson(slackWebHook));
        httpPost.setEntity(entity);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");

        client.execute(httpPost);
        client.close();
    }

}
