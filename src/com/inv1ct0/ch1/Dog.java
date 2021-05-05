package com.inv1ct0.ch1;

public class Dog {
    private String name;
    private int age;
    private Woman owner;

    public Dog(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Woman getOwner() {
        return owner;
    }
}
