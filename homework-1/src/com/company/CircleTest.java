package com.company;

import junit.framework.TestCase;

public class CircleTest extends TestCase {

    public void testCalculateArea() {
        Circle c1 = new Circle(-3.);
        double result = c1.calculateArea();
        assertTrue(result == 0.);

        c1 = new Circle(0.);
        result = c1.calculateArea();
        assertTrue(result == 0.);

        c1 = new Circle(3.);
        result = c1.calculateArea();
        assertTrue(result == Math.PI * 9.);

        c1 = new Circle(5.);
        result = c1.calculateArea();
        assertTrue(result == Math.PI * 25.);
    }
}