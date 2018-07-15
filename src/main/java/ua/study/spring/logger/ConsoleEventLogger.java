package ua.study.spring.logger;

import ua.study.spring.beans.Event;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event) {
        event.toString();
    }
}
