package com.shapes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    // Test condition for area
    @ParameterizedTest
    @MethodSource("provideSidesForArea")
    void shouldCalculateAreaOfSquare(double side, double expectedArea) {
        // Given
        Square square = new Square(side);

        // When
        double actualArea = square.area();

        // Then
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideSidesForArea() {
        return Stream.of(
                Arguments.of(2.0,4.0),
                Arguments.of(0.0, 0.0),
                Arguments.of(-3.0,0.0)
        );
    }

    //Test Condition for Perimeter
    @ParameterizedTest
    @MethodSource("provideSidesForPerimeter")
    void shouldCalculatePerimeterOfSquare(double side, double expectedPerimeter) {
        // Given
        Square square = new Square(side);

        // When
        double actualPerimeter = square.perimeter();

        // Then
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    private static Stream<Arguments> provideSidesForPerimeter() {
        return Stream.of(
                Arguments.of(2.0,8.0),
                Arguments.of(0.0, 0.0),
                Arguments.of(-3.0,0.0)
        );
    }


}