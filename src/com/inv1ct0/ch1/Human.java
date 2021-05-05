package com.inv1ct0.ch1;

class Human {

    private String name;
    private boolean isMale;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, boolean isMale, int age, Human father, Human mother) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, boolean isMale, int age) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\nпол: " + "\nвозраст: " + age + "\nотец: " + father + "\nмать: " + mother;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getAge() {
        return age;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }
}
