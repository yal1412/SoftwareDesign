package com.company;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {

    public void testCalculateArea() {

        Rectangle r1 = new Rectangle(-3., -5.);
        double result = r1.calculateArea();
        assertTrue(result == 0.);

        r1 = new Rectangle(0., -5.);
        result = r1.calculateArea();
        assertTrue(result == 0.);

        r1 = new Rectangle(-3., 0.);
        result = r1.calculateArea();
        assertTrue(result == 0.);

        r1 = new Rectangle(3., 5.);
        result = r1.calculateArea();
        assertTrue(result == 15.);
    }
}