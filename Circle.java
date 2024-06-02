package com.mycompany.projectoop;

public class Circle extends Geometric{
    private double radius;
    
    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * 3.14 * this.radius;
    }
}