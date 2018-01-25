package jenkins.Maths;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	public void testAddition() {
		assertEquals(20, App.addition(10, 10));
	}

	public void testSubtraction() {
		assertEquals(0, App.subtraction(10, 10));
	}

	public void testMultiplication() {
		assertEquals(100, App.multiplication(10, 10));
	}

	public void testDivision() {
		assertEquals(1, App.division(10, 10));
	}
}
