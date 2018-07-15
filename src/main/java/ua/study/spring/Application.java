package ua.study.spring;

import ua.study.spring.bean.Client;
import ua.study.spring.logger.EventLogger;

public class Application {
    Client client;
    EventLogger log;

    public Application(Client client, EventLogger log){
        this.client = client;
        this.log = log;
    }

    public void logEvent(){
        log.logEvent(client.getName());
    }
}
