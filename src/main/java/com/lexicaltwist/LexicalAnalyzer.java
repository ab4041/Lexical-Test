package com.lexicaltwist;

import java.util.LinkedHashSet;

public class LexicalAnalyzer {

    // UC4 logic
    public static boolean isReverse(String word1, String word2) {

        String reversed =
                new StringBuilder(word1)
                        .reverse()
                        .toString();

        return reversed.equalsIgnoreCase(word2);
    }


    // UC5 logic
    public static String transformWord(String word) {

        String reversed =
                new StringBuilder(word)
                        .reverse()
                        .toString();

        reversed = reversed.toLowerCase();

        return reversed.replaceAll("[aeiou]", "@");
    }


    // UC6 logic
    public static String combineWords(String word1, String word2) {

        return (word1 + word2).toUpperCase();
    }


    // UC7 logic
    public static void applyRule(String combinedWord) {

        int vowels = 0;
        int consonants = 0;

        LinkedHashSet<Character> vowelSet =
                new LinkedHashSet<>();

        LinkedHashSet<Character> consonantSet =
                new LinkedHashSet<>();


        for (char ch : combinedWord.toCharArray()) {

            if ("AEIOU".indexOf(ch) != -1) {

                vowels++;
                vowelSet.add(ch);
            }

            else if (Character.isLetter(ch)) {

                consonants++;
                consonantSet.add(ch);
            }
        }


        if (vowels > consonants) {

            System.out.print("First 2 unique vowels: ");

            int count = 0;

            for (char ch : vowelSet) {

                System.out.print(ch + " ");
                count++;

                if (count == 2)
                    break;
            }
        }


        else if (consonants > vowels) {

            System.out.print("First 2 unique consonants: ");

            int count = 0;

            for (char ch : consonantSet) {

                System.out.print(ch + " ");
                count++;

                if (count == 2)
                    break;
            }
        }


        else {

            System.out.println(
                    "Vowels and consonants are equal");
        }
    }
}