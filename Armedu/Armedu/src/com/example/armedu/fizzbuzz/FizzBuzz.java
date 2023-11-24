package com.example.armedu.fizzbuzz;

public class FizzBuzz {

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            String result = fizzBuzz(i);
            System.out.println(result);
        }
    }

    public static String fizzBuzz(int number) {
        if (number <= 0) {
            return "Invalid input";
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static void main(String[] args) {
    										
        fizzBuzz();

        performUnitTests();
    }

    public static void performUnitTests() {
       
        // multiples of 3 and 5 (FizzBuzz)
        assert fizzBuzz(15).equals("FizzBuzz");

        // Multiples of 3 (Fizz)
        assert fizzBuzz(3).equals("Fizz");
        assert fizzBuzz(6).equals("Fizz");

        // Multiples of 5 (Buzz)
        assert fizzBuzz(5).equals("Buzz");
        assert fizzBuzz(10).equals("Buzz");


        System.out.println("All unit tests passed!");
    }
}
