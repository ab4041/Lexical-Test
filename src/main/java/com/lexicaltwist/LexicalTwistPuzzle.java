package com.lexicaltwist;

import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lexical Twist Puzzle");

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();


        // Validation handled by WordValidator class
        if (!WordValidator.isSingleWord(word1)
                || !WordValidator.isSingleWord(word2)) {

            System.out.println("Invalid input");
            return;
        }


        // Reverse match condition handled by analyzer
        if (LexicalAnalyzer.isReverse(word1, word2)) {

            String result =
                    LexicalAnalyzer.transformWord(word1);

            System.out.println(result);
        }

        // Non-reverse condition handled by analyzer
        else {

            String combined =
                    LexicalAnalyzer.combineWords(word1, word2);

            System.out.println("Combined Word = " + combined);

            LexicalAnalyzer.applyRule(combined);
        }

        sc.close();
    }
}