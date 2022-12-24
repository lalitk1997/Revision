package io.project.JUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void initialize(){
        calculator = new Calculator();
    }
    @Test
    public void testMultiply(){
        assertEquals(20, calculator.multiply(4, 5));
    }
    @Test
    public  void testDivide(){
        assertEquals(10, calculator.divide(10, 1));
        /*
        This scenario will fail.
         */
        // assertEquals(0, calculator.divide(1, 0));
    }
    /*
    Test Failed
     */
//    @Test
//    public void testMultiply_(){
//        assertEquals(10, calculator.multiply(10, 2));
//    }
}
