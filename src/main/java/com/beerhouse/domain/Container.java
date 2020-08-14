package com.beerhouse.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Container {
    private String type;

    private String measure;

    protected Container(String type, String measure) {
        this.type = type;
        this.measure = measure;
    }

    protected Container() {}

    public static Container create(String type, String measure) {
        return new Container(type, measure);
    }

    public String type() {
        return this.type;
    }

    public String measure() {
        return this.measure;
    }
}
