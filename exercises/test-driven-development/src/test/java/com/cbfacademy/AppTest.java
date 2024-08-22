package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }

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
    // @Test
    // @DisplayName("prints Buzz").m
    // public void testBuzz() {
    // assertEquals("Buzz", FizzBuzz.get(5));
    // }
}