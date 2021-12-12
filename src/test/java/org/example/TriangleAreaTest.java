package org.example;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import java.lang.Math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TriangleAreaTest {
    private static Logger logger = (Logger) LoggerFactory.getLogger(TriangleAreaTest.class);

    java.awt.Point a;
    java.awt.Point b;
    java.awt.Point c;

    public TriangleAreaTest(java.awt.Point a, java.awt.Point b, java.awt.Point c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea()
    {
        double area;
        return area = Math.abs((a-c)*(b-a)-(a-b)*(c-a));
    }

    @Test
    public void addSubTest() {

        assertEquals("Error in add()!", 3, TriangleArea.add(1, 2));
        assertEquals("Error in sub()!", 1, TriangleArea.sub(2, 1));
    }

    @Test
    public void mulDivTest() {
        assertEquals("Error in mul()!", 6, TriangleArea.mul(2, 3));
    }

}

