package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	@Test
	@DisplayName("prints FizzBuzz")
	public void testFizzBuzz() {
		assertEquals("FizzBuzz", FizzBuzz.get(15));
	}

	@Test
	@DisplayName("prints Fizz")
	public void testFizz() {
		assertEquals("Fizz", FizzBuzz.get(3));
	}

	@Test
	@DisplayName("prints Buzz")
	public void testBuzz() {
		assertEquals("Buzz", FizzBuzz.get(5));
	}

}
