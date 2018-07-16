package ua.study.spring.logger;

import java.util.List;

public class CombinedEventLogger implements EventLogger {
    private List loggers;

    public CombinedEventLogger(List loggers){
        this.loggers = loggers;
    }
    @Override
    public void logEvent(String msg) {

    }
}
