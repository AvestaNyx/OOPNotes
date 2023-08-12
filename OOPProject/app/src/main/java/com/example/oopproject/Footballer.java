package com.example.oopproject;

public class Footballer {

    private String name;
    private String brand;
    private int age;


    public Footballer(String name, String brand, int age) {
        this.name = name;
        this.brand = brand;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAge(int age, String password) {
        if (password.matches("Kagan")){
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }
}
