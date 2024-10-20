package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        // takes a list of integer and returns a list of string
        List<String> result = new ArrayList<String>();
        // enpty lsit called reult to hold the string
        // it creates a list where for each element of the input list ${numbers}

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
                result.add("FizzBuzz");
            } else if (numbers.get(i) % 3 == 0) {
                result.add("Fizz");
            } else if (numbers.get(i) % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(numbers.get(i).toString());
            }
        }

        return result;

        // throw new RuntimeException("Not implemented");
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        // - it returns the month corresponding to the input ${number}
        // - if the ${number} is invalid, the method should return "Invalid month
        // number"

        if (number == null || number < 1 || number > 12) {
            return "Invalid month number";
        }

        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"

        };

        return months[number - 1];

        // throw new RuntimeException("Not implemented");
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {

        // Create and initialize a list of numbers from 1 to 100
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // Determine the sum of all even numbers
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEvens += number;
            } else {
                sumOfOdds += number;
            }
        }
        final int calculatedSumOfEvens = sumOfEvens;
        final int calculatedSumOfOdds = sumOfOdds;

        return new HashMap<String, Integer>() {
            {
                put("SumOfEvens", calculatedSumOfEvens);
                put("SumOfOdds", calculatedSumOfOdds);
            }
        };
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {

        List<Integer> reversedList = new ArrayList<>(numbers);

        Collections.reverse(reversedList);
        return reversedList;

        // TODO - Implement this method such that
        // - it takes an array list of integers
        // - it returns the list in reverse order
        // throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
