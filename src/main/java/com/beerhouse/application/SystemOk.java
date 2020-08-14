package com.beerhouse.application;

import java.util.Date;

public class SystemOk {
    private String msg;
    private Date date;

    public SystemOk(String msg, Date date) {
        this.date = date;
        this.msg = msg;
    }

    public String getMsg() { return this.msg; }
    public Date getDate() { return this.date; }
}
