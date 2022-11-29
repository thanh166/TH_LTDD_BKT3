package com.example.bkt3;

public class PhepTinh {
    private String name;
    private double a, b;

    public PhepTinh(String name, double a, double b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }
    public PhepTinh(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}

