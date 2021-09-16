import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @ParameterizedTest
    @CsvSource({"-3.,-5.,0.", "-3.,0.,0.", "0.,-5.,0.", "3.,5.,15."})
    void calculateArea(double vs, double hs, double square) {
        Rectangle r = new Rectangle(vs, hs);
        assertEquals(square, r.calculateArea());
    }
}