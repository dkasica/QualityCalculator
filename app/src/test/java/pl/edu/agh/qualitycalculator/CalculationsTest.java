package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3), 0.01);
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(1, calculationsUnderTest.calculate(Operation.SUBTRACT, 3, 2), 0.01);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(1.5, calculationsUnderTest.calculate(Operation.DIVIDE, 3, 2), 0.01);
    }
    
    @Test
    public void testMultiply() throws Exception {
        assertEquals(6, calculationsUnderTest.calculate(Operation.MULTIPLY, 2, 3), 0.01);
    }
    
    @After
    public void tearDown() {
    }
}
