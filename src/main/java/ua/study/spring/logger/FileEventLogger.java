package ua.study.spring.logger;

import org.apache.commons.io.FileUtils;
import ua.study.spring.beans.Event;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private String fileName;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(new File(fileName), event.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
