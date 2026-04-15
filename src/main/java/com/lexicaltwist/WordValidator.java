package com.lexicaltwist;

public class WordValidator {

    public static boolean isSingleWord(String word) {

        // Check if input contains spaces
        if (word.contains(" ")) {

            return false;

        }

        return true;

    }
}