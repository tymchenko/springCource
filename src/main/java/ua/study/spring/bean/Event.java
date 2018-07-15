package ua.study.spring.bean;

import java.util.Date;
import java.util.Random;

public class Event {
    private int id;
    private String msg;
    private Date date;

    public Event(){
        id = new Random().nextInt();
        date = new Date();
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
