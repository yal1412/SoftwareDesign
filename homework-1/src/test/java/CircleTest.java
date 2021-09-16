import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @ParameterizedTest
    @CsvSource({"-3.,0", "0.,0.", "3.," + Math.PI * 9., "5.," + Math.PI * 25.})
    void calculateArea(double r, double square) {
        Circle c = new Circle(r);
        assertEquals(square, c.calculateArea());
    }
}