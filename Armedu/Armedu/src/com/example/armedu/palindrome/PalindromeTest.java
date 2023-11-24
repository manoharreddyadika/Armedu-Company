package com.example.armedu.palindrome;

public class PalindromeTest {

    public static void main(String[] args) {
        testIsPalindrome();
    }

    public static void testIsPalindrome() {
        String[] testStrings = {
            "rotor4", 
            "racecar",
            "hello", 
            "level", 
            "noon", 
          
        };
      
		  for (String str : testStrings) {
			  if (PalindromeChecker.isPalindrome(str)) {
		            if (str.length() % 2 == 0) {
		                System.out.println("'"+str+"'  =====length("+str.length()+")==Even-length palindrome");
		            } else {
		            	System.out.println("'"+str+"'  ====length("+str.length()+")==Odd-length palindrome"); 
		            }
		        } else {
		        	System.out.println("'"+str+"'   ====length("+str.length()+")==Not a palindrome"); 
		        }
		    }
			  
		
		//	  System.out.println("Is '" + str+" = "+str.length() +"' is a palindrome? " + PalindromeChecker.isPalindrome(str)); }
	
    }
    
    public static void evenOrOddPalindrome1(String s) {
        if (PalindromeChecker.isPalindrome(s)) {
            if (s.length() % 2 == 0) {
                System.out.println("Even-length palindrome");
            } else {
            	System.out.println("Odd-length palindrome"); 
            }
        } else {
        	System.out.println("Not a palindrome"); 
        }
    }
}

