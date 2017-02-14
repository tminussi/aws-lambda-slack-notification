package br.com.bluesoft.handler;

import br.com.bluesoft.model.SlackWebHook;
import br.com.bluesoft.model.factory.SlackWebHookFactory;
import br.com.bluesoft.service.HttpPostClient;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.io.IOException;

public class LambdaSlackNotificationHandler implements RequestHandler<SlackWebHook, String>{

    public String handleRequest(SlackWebHook slackWebHook, Context context) {
        try {
            HttpPostClient.executePostRequest(SlackWebHookFactory.create());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "SUCCESS";
    }

}
