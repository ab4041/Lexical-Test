package com.lexicaltwist;

public class WordValidator {

    public static boolean isSingleWord(String word) {

        return !word.contains(" ");
    }
}