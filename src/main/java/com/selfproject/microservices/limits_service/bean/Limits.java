package com.selfproject.microservices.limits_service.bean;

public class Limits {
    private int minimum;
    private int maximum;
    
    public int getMinimum() {
        return minimum;
    }

    public Limits() {
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
