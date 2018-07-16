package ua.study.spring.logger;

import ua.study.spring.beans.Event;

import java.util.List;

public class CacheFileLogger extends FileEventLogger {
    private int casheSize;
    private List<Event> cache;

    public CacheFileLogger(String fileName, int casheSize) {
        super(fileName);
        this.casheSize = casheSize;
    }

    public void logEvent(Event event){
        cache.add(event);
        if(cache.size() == casheSize){
            writeEventFromCashe();
            cache.clear();
        }
    }

    private void writeEventFromCashe() {
        for(Event event : cache){
            super.logEvent(event);
        }
    }

    private void destroy(){
        if(!cache.isEmpty()){
            writeEventFromCashe();
        }
    }
}
