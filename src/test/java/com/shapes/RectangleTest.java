package com.shapes;

import com.shapes.Rectangle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {


    // To check if area is correct
 /*   @Test
    void shouldCalculateAreaofRectangle() {
        Rectangle rectangle = new Rectangle(4.0,5.0);
        assertEquals(20, rectangle.area());
    }*/

   /* // To handle invalid inputs
    @Test
    void handlingInvalidInputs() {
        //if length is zero for area
        Rectangle rectangle = new Rectangle(0.0,5.0);
        assertEquals(0, rectangle.area());
        //if length is negative for area
        Rectangle negRectangle = new Rectangle(-4.0,5.0);
        assertEquals(0,negRectangle.area());
        //checking invalid inputs for Perimeter
        Rectangle inValidRectangle = new Rectangle(-4.0,5.0);
        assertEquals(0,inValidRectangle.perimeter());
    }

    //TO calculate perimeter of com.shapes.Rectangle
    @Test
    void shouldCalculateRectanglePerimeter(){
        Rectangle rectangle = new Rectangle(10.0,5.0);
        assertEquals(30, rectangle.perimeter());
    }*/

    // Test condition for area
    @ParameterizedTest
    @MethodSource("provideLengthandWidthForArea")
    void shouldCalculateAreaofRectangle(double length,double breadth, double expectedArea) {
        // Given
        Rectangle rectangle = new Rectangle(length,breadth);

        // When
        double actualArea = rectangle.area();

        // Then
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideLengthandWidthForArea() {
        return Stream.of(
                Arguments.of(2.0,4.0,8.0),
                Arguments.of(0.0, 0.0,0.0),
                Arguments.of(-3.0,0.0,0.0)
        );
    }

    // Test condition for perimeter
    @ParameterizedTest
    @MethodSource("provideLengthandWidthForPerimeter")
    void shouldCalculatePerimeterofRectangle(double length,double breadth, double expectedPerimeter) {
        // Given
        Rectangle rectangle = new Rectangle(length,breadth);

        // When
        double actualPerimeter = rectangle.perimeter();

        // Then
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    private static Stream<Arguments> provideLengthandWidthForPerimeter() {
        return Stream.of(
                Arguments.of(2.0,4.0,12.0),
                Arguments.of(0.0, 5.0,0.0),
                Arguments.of(-3.0,0.0,0.0)
        );
    }

}