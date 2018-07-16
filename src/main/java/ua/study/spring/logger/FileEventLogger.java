package ua.study.spring.logger;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private File file;

    public FileEventLogger(String fileName) {
        file = new File(fileName);

    }

    public void logEvent(String msg) {
        try {
            FileUtils.writeStringToFile(file, msg);
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
