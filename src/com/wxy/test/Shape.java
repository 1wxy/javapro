package com.wxy.test;

public abstract class Shape {
    private int area;
    private int per;
    private String color;

    public int getarea() {
        return area;
    }

    public void setarea(int area) {
        this.area = area;
    }

    public int getper() {
        return per;
    }

    public void setper(int per) {
        this.per = per;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }
    public Shape(){}
    public Shape(String color){
        this.color=color;
    }
    public abstract int getArea();
    public abstract void Showall();
    public abstract double getPer();
}
