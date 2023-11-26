package com.example.armedu.palindrome;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Is the string a palindrome? " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
       
        if (str.length() <= 1) {
            return true;
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }
}
