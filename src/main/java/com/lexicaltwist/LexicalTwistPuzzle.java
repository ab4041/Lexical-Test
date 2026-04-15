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


        // Validation check for first word
        if (!WordValidator.isSingleWord(word1)) {

            System.out.println(word1 + " is an invalid word");
            return;

        }


        // Validation check for second word
        if (!WordValidator.isSingleWord(word2)) {

            System.out.println(word2 + " is an invalid word");
            return;

        }


        // If both valid
        System.out.println("Both words are valid inputs");

        sc.close();

    }
}