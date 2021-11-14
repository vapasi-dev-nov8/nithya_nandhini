package com.shapes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    // Test condition for area
    @ParameterizedTest
    @MethodSource("provideLengthandBreadthForArea")
    void shouldCalculateAreaofRectangle(double length,double breadth, double expectedArea) {
        // Given
        Rectangle rectangle = new Rectangle(length,breadth);

        // When
        double actualArea = rectangle.area();

        // Then
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideLengthandBreadthForArea() {
        return Stream.of(
                Arguments.of(2.0,4.0,8.0),
                Arguments.of(0.0, 0.0,0.0),
                Arguments.of(-3.0,0.0,0.0)
        );
    }

    // Test condition for perimeter
    @ParameterizedTest
    @MethodSource("provideLengthandBreadthForPerimeter")
    void shouldCalculatePerimeterofRectangle(double length,double breadth, double expectedPerimeter) {
        // Given
        Rectangle rectangle = new Rectangle(length,breadth);

        // When
        double actualPerimeter = rectangle.perimeter();

        // Then
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    private static Stream<Arguments> provideLengthandBreadthForPerimeter() {
        return Stream.of(
                Arguments.of(2.0,4.0,12.0),
                Arguments.of(0.0, 5.0,0.0),
                Arguments.of(-3.0,0.0,0.0)
        );
    }

}