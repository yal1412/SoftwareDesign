import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @ParameterizedTest
    @CsvSource({"-3.,0", "0.,0.", "3.,9.", "5.,25."})
    void calculateArea(double r, double square) {
        Square s = new Square(r);
        assertEquals(square, s.calculateArea());
    }
}