import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    // To check if area is correct
    @Test
    void checkAreaofRectangle() {
        assertEquals(20, Rectangle.calculateArea(4.0,5.0));
    }

    // To handle null inputs
    @Test
    void handlingNullInputs() {
        assertEquals(0, Rectangle.calculateArea(null,null));
    }

}