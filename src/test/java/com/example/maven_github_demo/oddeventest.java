package com.example.maven_github_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class oddeventest {

    oddeven obj = new oddeven();

    @Test
    public void testEvenNumber() {
        assertEquals("Even", obj.checkNumber(10));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", obj.checkNumber(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", obj.checkNumber(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Odd", obj.checkNumber(-5));
    }
}
