package com.lexicaltwist;

public class WordValidator {

    public static boolean isSingleWord(String word) {

        if (word.contains(" ")) {

            return false;

        }

        return true;

    }
}