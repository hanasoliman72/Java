package com.mycompany.projectoop;

public class Rectangle extends Geometric{
    
    private double width;
    private double height;
    
    public Rectangle(){}
    
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    
    @Override
    public double getArea() {
        return this.width * this.height;
    }
    @Override
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    
    
}
