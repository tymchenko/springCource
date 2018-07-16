package ua.study.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.study.spring.event.EventType;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Application application = (Application)ctx.getBean("application");
        application.logEvent(EventType.ERROR, "Error");
        application.logEvent(EventType.INFO, "1");

//        ctx.close();
    }
}
