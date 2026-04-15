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


    // UC6 logic
    public static String combineWords(String word1, String word2) {

        return (word1 + word2).toUpperCase();

    }


    // UC6 logic
    public static void countCharacters(String word) {

        int vowels = 0;
        int consonants = 0;

        for (char ch : word.toCharArray()) {

            if ("AEIOU".indexOf(ch) != -1) {

                vowels++;

            } else if (Character.isLetter(ch)) {

                consonants++;

            }

        }

        System.out.println("Combined Word = " + word);
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

    }

}