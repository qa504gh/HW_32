package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

//public void test_01_1() {assertEquals("Not correct", Calculator.divide(90.0, 7.0), 12.9, 0.09);
	
	@Test
	public void testAdd2Double() {
		assertEquals("Not correct", Calculator.add(5.0, 7.0), 12.0, 0.09);
	}

	@Test
	public void testAdd3Double() {
		assertEquals("Not correct", Calculator.add(5.0, 7.0, 3.0), 15.0, 0.09);
	}

	@Test
	public void testAdd4Double() {
		assertEquals("Not correct", Calculator.add(5.0, 7.0, 3.0, 2.0), 17.0, 0.09);
	}

}
