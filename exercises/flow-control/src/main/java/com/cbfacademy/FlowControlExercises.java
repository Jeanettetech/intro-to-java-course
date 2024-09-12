package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        List<String> result = new ArrayList<String>();

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

        // Create a map to store the results
        Map<String, Integer> result = new HashMap<>();
        result.put("SumOfEvens", sumOfEvens);
        result.put("SumOfOdds", sumOfOdds);

        return result;
    }

    public static void main(String[] args) {
        NumberSums numsum = new NumberSums();
        Map<String, Integer> result = numsum.sumOfOddsAndSumOfEvens();
        System.out.println(result);

        // TODO - Implement this method such that
        // - creates and initialises a list of 100 numbers - from 1 to 100
        // - determines the sum of all the even numbers in the list
        // - determines the sum of all the odd numbers in the list
        // - returns a map with two entries:
        // {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {

        List<Integer> reversedList = new ArrayList<>(numbers);
        // Use Collections.reverse to reverse the list
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
