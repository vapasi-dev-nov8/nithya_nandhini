package com.shapes;

public class Rectangle {


    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    // Method to calculate area of rectangle
    public double area() {
        if(length > 0.0 && breadth > 0.0){
            double area = length * breadth;
            return area;
        }
        System.out.println("Please provide valid inputs");
        return 0;
    }
    //method to calculate perimeter
    public double perimeter() {
        if(length > 0.0 && breadth > 0.0) {
            double perimeter = 2 * (length + breadth);
            return perimeter;
        }
        System.out.println("Please provide valid inputs");
        return 0;
    }
}
