package com.example.fragmenttransaction_events;

import java.io.Serializable;

public class Model implements Serializable {
    String tittle;
    String Desc;
    String start_date;
    String end_date;
    String start_time;
    String end_time;
    String price;

    public Model(String tittle, String desc) {
        this.tittle = tittle;
        Desc = desc;
    }

    public Model(String tittle, String desc, String start_date, String end_date, String start_time,
                 String end_time) {
        this.tittle = tittle;
        Desc = desc;
        this.start_date = start_date;
        this.end_date = end_date;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Model(String tittle, String desc, String start_date,
                 String end_date, String start_time, String end_time, String price) {
        this.tittle = tittle;
        Desc = desc;
        this.start_date = start_date;
        this.end_date = end_date;
        this.start_time = start_time;
        this.end_time = end_time;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDesc() {
        return Desc;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getPrice() {
        return price;
    }
}
