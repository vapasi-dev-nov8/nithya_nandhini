package com.shapes;

import com.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {


    // To check if area is correct
    @Test
    void shouldCalculateAreaofRectangle() {
        Rectangle rectangle = new Rectangle(4.0,5.0);
        assertEquals(20, rectangle.area());
    }

    // To handle invalid inputs
    @Test
    void handlingInvalidInputs() {
        //if length is zero
        Rectangle rectangle = new Rectangle(0.0,5.0);
        assertEquals(0, rectangle.area());
        //if length is negative
        Rectangle negRectangle = new Rectangle(-4.0,5.0);
        assertEquals(0,negRectangle.area());
    }

    //TO calculate perimeter of com.shapes.Rectangle
    @Test
    void shouldCalculateRectanglePerimeter(){
        Rectangle rectangle = new Rectangle(10.0,5.0);
        assertEquals(30, rectangle.perimeter());
    }

}