package ua.study.spring;

import ua.study.spring.beans.Client;
import ua.study.spring.logger.ConsoleEventLogger;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        app.client = new Client("1", "Ivan");
        app.log = new ConsoleEventLogger();
        app.logEvent(app.client.getId());

    }
}
