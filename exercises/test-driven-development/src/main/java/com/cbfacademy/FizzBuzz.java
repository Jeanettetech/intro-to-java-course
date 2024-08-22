package com.cbfacademy;

public class FizzBuzz {
	public static String get(int num) {
		if (num % 15 == 0) {
			return "FizzBuzz";

		} else if (num % 3 == 0) {
			return "Fizz";
			// }
			// else if (num % 5 ==0) {
			// return "Buzz";
		}
		return String.valueOf(num);

	}

}
