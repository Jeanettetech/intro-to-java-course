package com.cbfacademy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class YearTest {
	static Stream<Arguments> inputAndOutputProvider() {
		return Stream.of(
				Arguments.of(1600, true),
				Arguments.of(1601, false),
				Arguments.of(1700, false),
				Arguments.of(4050, false),
				Arguments.of(6000, true),
				Arguments.of(7010, false));

	}

	@ParameterizedTest
	@MethodSource("inputAndOutputProvider")
	@DisplayName("determine whether a given year is a leap year, or not")
	public void returnExpectedValue(Integer number, Boolean expected) {
		final Year year = new Year(number);
		assertThat(year.isLeap(), is(expected));

	}

}
