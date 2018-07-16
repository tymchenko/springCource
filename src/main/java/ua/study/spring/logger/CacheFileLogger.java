package ua.study.spring.logger;

import java.util.List;

public class CacheFileLogger extends FileEventLogger {
    private int casheSize;
    private List<String> cache;

    public CacheFileLogger(String fileName, int casheSize) {
        super(fileName);
        this.casheSize = casheSize;
    }

    public void logEvent(String msg){
        cache.add(msg);
        if(cache.size() == casheSize){
            writeEventFromCashe();
            cache.clear();
        }
    }

    private void writeEventFromCashe() {
        for(String event : cache){
            super.logEvent(event);
        }
    }

    private void destroy(){
        if(!cache.isEmpty()){
            writeEventFromCashe();
        }
    }
}
