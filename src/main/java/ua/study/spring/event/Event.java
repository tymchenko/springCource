package ua.study.spring.event;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Event {
    private int id = new Random().nextInt();;
    private String msg;
    private Date date;
    private DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    public boolean isDay(){
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(hour > 8 && hour < 17){
            return true;
        }
        return false;
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
