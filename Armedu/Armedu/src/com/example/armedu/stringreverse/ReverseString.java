package com.example.armedu.stringreverse;

public class ReverseString {

	
	
    public static String reverseSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return ""; 
        }

        String[] words = sentence.split("\\s+"); 

        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse(); 
            reversedSentence.append(reversedWord).append(" "); 
        }

        return reversedSentence.toString().trim(); 
    }
    
    public static void main(String[] args) {
  System.out.println( reverseSentence("Hi manohar , How are u"));
    	
   
    }

	

//    public static void main(String[] args) {
//        // Example usage
//        String inputSentence = "Hello World! This is a test.";
//        String reversed = reverseSentence(inputSentence);
//        System.out.println("Reversed sentence: " + reversed);
//
//        // Run JUnit tests
//        runTests();
//    }
//
//    public static void runTests() {
//        // JUnit tests
//        assertEquals("", reverseSentence("")); // Empty string
//        assertEquals("Word", reverseSentence("Word")); // String with one word
//        assertEquals("multiple with test a is This", reverseSentence("This is a test with multiple")); // Multiple words
//        assertEquals("!@#$%^&*()_+?><", reverseSentence(">?<+_)(*&^%$#@!")); // String with special characters
//    }
//
//    // JUnit tests
//    @Test
//    public void testEmptyString() {
//        assertEquals("", reverseSentence(""));
//    }
//
//    @Test
//    public void testSingleWord() {
//        assertEquals("Word", reverseSentence("Word"));
//    }
//
//    @Test
//    public void testMultipleWords() {
//        assertEquals("multiple with test a is This", reverseSentence("This is a test with multiple"));
//    }
//
//    @Test
//    public void testSpecialCharacters() {
//        assertEquals("!@#$%^&*()_+?><", reverseSentence(">?<+_)(*&^%$#@!"));
//    }
}
