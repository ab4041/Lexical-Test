package com.lexicaltwist;

public class LexicalAnalyzer {

    // UC4 logic
    public static boolean isReverse(String word1, String word2) {

        String reversedWord =
                new StringBuilder(word1)
                        .reverse()
                        .toString();

        return reversedWord.equalsIgnoreCase(word2);

    }


    // UC5 logic
    public static String transformWord(String word) {

        String reversedWord =
                new StringBuilder(word)
                        .reverse()
                        .toString();

        reversedWord = reversedWord.toLowerCase();

        return reversedWord.replaceAll("[aeiou]", "@");

    }
}