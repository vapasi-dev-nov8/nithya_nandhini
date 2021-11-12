package com.shapes;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    //TO calculate area
    public double area(){
        if(side>0.0){
            return side*side;
        }
        return 0;
    }

    //To calculate Perimeter
    public double perimeter(){
        if(side>0.0){
            return 4*side;
        }
        return 0;
    }
}
