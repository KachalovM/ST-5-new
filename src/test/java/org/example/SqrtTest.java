package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {
    @Test
    void testAverage() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.average(4.0, 2.0);
        assertEquals(3.0, result, 0.00000001);
    }

    @Test
    void testGood() {
        Sqrt sqrt = new Sqrt(2.0);
        boolean isGood = sqrt.good(1.41421356, 2.0);
        assertTrue(isGood);
    }

    @Test
    void testImprove() {
        Sqrt sqrt = new Sqrt(2.0);
        double improvedGuess = sqrt.improve(1.0, 2.0);
        assertEquals(1.5, improvedGuess, 0.00000001);
    }

    @Test
    void testIter() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.iter(1.0, 2.0);
        assertEquals(1.41421356, result, 0.00000001);
    }

    @Test
    void testCalc() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.calc();
        assertEquals(1.41421356, result, 0.00000001);
    }
}
