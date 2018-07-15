package ua.study.spring;

import ua.study.spring.beans.Client;
import ua.study.spring.logger.EventLogger;

public class App {
    Client client;
    EventLogger log;

    public App(Client client, EventLogger log){
        this.client = client;
        this.log = log;
    }

    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getName());
        log.logEvent(message);
    }
}
