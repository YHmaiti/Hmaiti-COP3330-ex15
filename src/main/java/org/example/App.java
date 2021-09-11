/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program validates user login credentials.
// The program prompts the user for a username and password.
// The program compares the password given by the user to a known
// password. If the password matches, the program displays
// “Welcome!” If it doesn’t match, the program display s
// “I don’t know you.”

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // create a constant variable that will store the correct password
        // that will be used as a reference
        final String rightPassword  = "abc$123";

        // create variables that will store the entered username and password
        // by the user accordingly
        String entryAttempt;
        String username;

        // prompt the user for the username and password
        System.out.print("What is your username? ");
        username = scanner.nextLine();
        System.out.print("What is the password? ");
        entryAttempt = scanner.nextLine();

        // check if the password is correct and output accordingly
        if (entryAttempt.equals(rightPassword)) {

            System.out.print("Welcome!");

        } else {

            System.out.print("I don't know you.");

        }

    }

}