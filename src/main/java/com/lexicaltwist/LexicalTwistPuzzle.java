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


        // UC3 validation
        if (!WordValidator.isSingleWord(word1)) {

            System.out.println(word1 + " is an invalid word");
            return;
        }

        if (!WordValidator.isSingleWord(word2)) {

            System.out.println(word2 + " is an invalid word");
            return;
        }


        // Reverse case (UC5)
        if (LexicalAnalyzer.isReverse(word1, word2)) {

            String result =
                    LexicalAnalyzer.transformWord(word1);

            System.out.println(result);
        }


        // Not reverse case (UC6 + UC7)
        else {

            String combined =
                    LexicalAnalyzer.combineWords(
                            word1, word2);

            System.out.println(
                    "Combined Word = " + combined);

            LexicalAnalyzer.applyRule(combined);
        }

        sc.close();
    }
}