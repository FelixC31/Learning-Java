package com.JavaStream;

public class Animal {
    private String name;
    private String color;
    private int age;
    private String type;

    public Animal(String name, String color, int age, String type) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
