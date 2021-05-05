package com.inv1ct0.ch1;

public class Man {
    private String name;
    private int age;
    private Woman wife;

    public Man(String name, int age, Woman wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;
    }

    public String getName() {
        return name;
    }

    public Woman getWife() {
        return wife;
    }
}
