package com.wxy.test;



public class Circle extends Shape {
    private int radius=1;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Circle(){}
    public Circle(int radius){
        this.radius=radius;
    }
    public Circle(String color){
        super(color);
    }

    @Override
    public int getArea() {
        return 3*radius*radius;
    }

    @Override
    public double getPer() {
        return 2*3*radius;
    }

    @Override
    public void Showall() {
            System.out.print("半径"+radius);
            System.out.println("面积"+getArea());

    }
}
