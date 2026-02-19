package Example01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator c = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(10,c.addition(5, 5));
	}
	@Test
	public void testSubstract() {
		assertEquals(10,c.substraction(30, 20));
	}
	@Test
	public void testMultiply() {
		assertEquals(10,c.multiply(2, 5));
	}
	@Test
	public void testDivide() {
		assertEquals(5,c.division(30, 6));
	}
	@Test
	public void testAdd2() {
		assertEquals(25,c.addition(5, 5));
	}
	@Test
	public void testSubstract2() {
		assertEquals(5,c.substraction(30, 25));
	}
	@Test
	public void testMultiply2() {
		assertEquals(10,c.multiply(2, 5));
	}
	@Test
	public void testDivide2() {
		assertEquals(0.5,c.division(3, 6)); // because it returns an integer value
	}

}
