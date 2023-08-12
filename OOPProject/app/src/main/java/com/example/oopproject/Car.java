package com.example.oopproject;

public class Car implements Company, Investor{

    String brand;
    boolean digital;

    @Override
    public void info() {
        System.out.println("override method");
    }
}
