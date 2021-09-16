import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void testCalculateArea() {

        Square s1 = new Square(-3.);
        double result = s1.calculateArea();
        assertTrue(result == 0.);

        s1 = new Square(0.);
        result = s1.calculateArea();
        assertTrue(result == 0.);

        s1 = new Square(3.);
        result = s1.calculateArea();
        assertTrue(result == 9.);

        s1 = new Square(5.);
        result = s1.calculateArea();
        assertTrue(result == 25.);

    }
}