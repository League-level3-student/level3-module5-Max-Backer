package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(30, RecursionMath.recursiveMultiplication(10, 3));
        assertEquals(50, RecursionMath.recursiveMultiplication(5, 10));

        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(5, RecursionMath.recursiveDivision(5, 1));
    	assertEquals(10, RecursionMath.recursiveDivision(30, 3));
    	assertEquals(4, RecursionMath.recursiveDivision(20, 5));

    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(25, RecursionMath.recursivePower(5, 2));
    	assertEquals(27, RecursionMath.recursivePower(3, 3));
    	assertEquals(10, RecursionMath.recursivePower(10, 1));

    }
}
