package com.lexicaltwist;

public class LexicalAnalyzer {

    public static boolean isReverse(String word1, String word2) {

        String reversedWord =
                new StringBuilder(word1)
                        .reverse()
                        .toString();

        return reversedWord.equalsIgnoreCase(word2);

    }
}