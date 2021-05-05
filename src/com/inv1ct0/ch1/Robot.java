package com.inv1ct0.ch1;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public boolean fight(Robot anotherRobot) {
        return anotherRobot.power < this.power;
    }
}
