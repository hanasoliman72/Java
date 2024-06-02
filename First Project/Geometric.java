package com.mycompany.projectoop;

import java.util.Date;

public abstract class Geometric {
     private String colour;
     private boolean filled;
     Date dateCreated;
     protected Geometric(){
         
     }

    protected Geometric(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isFilled(){
        return this.filled;
    }            

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Geometric{" + "colour=" + colour + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
    public abstract double getArea();
    public abstract double getPerimeter(); 
    
}