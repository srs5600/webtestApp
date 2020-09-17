package com.sa.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.sa.demo.Calculator;

public class CalculatorTest {
	private  Calculator objCalcTest;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		objCalcTest = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = objCalcTest.subtract(a, b);
        Assert.assertEquals(expectedResult, result);;
	}

	@Test
	public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = objCalcTest.multiply(a, b);
        Assert.assertEquals(expectedResult, result);;
	}

	@Test
	public void testDivide() {
        int a = 56;
        int b = 10;
        double expectedResult = 5.6;
        double result = objCalcTest.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
	}

}
