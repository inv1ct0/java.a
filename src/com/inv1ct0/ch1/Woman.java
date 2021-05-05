package com.inv1ct0.ch1;

public class Woman {
    private String name;
    private int age;
    private Man husband;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Man getHusband() {
        return husband;
    }

    public void setHusband(Man husband) {
        this.husband = husband;
    }
}
