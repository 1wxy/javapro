package com.wxy.test;

public  class Rectangle extends Shape {
    private int height=1;
    private int width=2;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public Rectangle(){}
    public Rectangle(int width,int height,String color){
        super(color);
        this.width=width;
        this.height=height;

    }

    @Override
    public int getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return (height+width)*2;
    }

    @Override
    public void Showall() {
        System.out.print("宽度"+width);
        System.out.print("高度"+height);
        System.out.println("面积"+getArea());
    }
}
