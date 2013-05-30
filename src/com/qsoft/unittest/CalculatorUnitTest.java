package com.qsoft.unittest;

import org.junit.Test;

import com.qsoft.Calculator;

import static org.junit.Assert.*;

public class CalculatorUnitTest {

	@Test
	public void addNumberNull() {
		assertEquals(0, Calculator.add(null));
	}

	@Test
	public void addNumberEmpty() {
		assertEquals(1, Calculator.add(""));
	}

	@Test
	public void addNumberTwoNumber() {
		assertEquals(10, Calculator.add("1,9"));
	}

	@Test
	public void addNumberThreeNumber() {
		assertEquals(11, Calculator.add("1,9,1"));
	}

	@Test
	public void addNumberHasCharacter() {
		assertEquals(11, Calculator.add("1,\n9,1"));
	}

	@Test
	public void addNumberNegativesNumber() {
		try {
			assertEquals(1122, Calculator.add("-1,9,1"));
		} catch (Exception e) {
			assertEquals(true, "negatives not allowed".equals(e.getMessage()));
			// e.printStackTrace();
		}

	}
}
