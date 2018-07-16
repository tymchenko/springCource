package ua.study.spring.logger;

import org.apache.commons.io.FileUtils;
import ua.study.spring.beans.Event;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private File file;

    public FileEventLogger(String fileName) {
        file = new File(fileName);

    }

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init(){
        if(!file.canWrite()){
            file.setWritable(true);
        }
    }
}
