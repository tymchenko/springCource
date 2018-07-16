package ua.study.spring;

import ua.study.spring.beans.Client;
import ua.study.spring.event.EventType;
import ua.study.spring.logger.ConsoleEventLogger;
import ua.study.spring.logger.EventLogger;

import java.util.Map;

public class Application {
    Client client;
    EventLogger log;
    Map<EventType, EventLogger> loggers;

    public Application(Client client, EventLogger log, Map<EventType, EventLogger> loggers){
        this.client = client;
        this.log = log;
        this.loggers = loggers;
    }

    public void logEvent(EventType type, String msg){
        EventLogger logger = loggers.get(type);
        if(logger == null){
            logger = new ConsoleEventLogger();
        }
        logger.logEvent(client.getName());
    }
}
