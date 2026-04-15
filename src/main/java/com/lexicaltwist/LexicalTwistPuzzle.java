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


        // UC3 validation logic
        if (!WordValidator.isSingleWord(word1)) {

            System.out.println(word1 + " is an invalid word");
            return;

        }

        if (!WordValidator.isSingleWord(word2)) {

            System.out.println(word2 + " is an invalid word");
            return;

        }


        // UC4 reverse relationship check
        if (LexicalAnalyzer.isReverse(word1, word2)) {

            System.out.println("Second word is reverse of first word");

        } else {

            System.out.println("Second word is NOT reverse of first word");

        }

        sc.close();

    }
}