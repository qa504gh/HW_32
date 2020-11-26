package core;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest2 {

	@Test
	public void testSubtract2Double() {
		assertEquals("Not correct", Calculator.subtract(5.0,  2.0), 3.0, 0.09);
	}

	@Test
	public void testSubtract3Double() {
		assertEquals("Not correct", Calculator.subtract(5.0, 1.0, 3.0), 1.0, 0.09);
	}

	@Test
	public void testSubtract4Double() {
		assertEquals("Not correct", Calculator.subtract(10.0, 2.0, 3.0, 2.0), 3.0, 0.09);
	}

}
