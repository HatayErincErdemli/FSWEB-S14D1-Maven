package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width < 0 ? 0 : width;
        this.length = Math.max(length,0);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return this.width * this.length;
    }
}
