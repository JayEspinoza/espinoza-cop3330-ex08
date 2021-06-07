/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 8 - Pizza Party
 *  Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
 *  Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.
 *
 *  Constraint:
 *  N/A
 */

package ex08;
import java.util.Scanner;

public class base {
    public static void main(String[] args) {
        // Variable initialization
        Scanner userInput = new Scanner(System.in);
        int people, pizzas, slices, sliceTotal, remainder, slicePerPerson;

        // User Input Step
        System.out.printf("How many people? ");
        people = userInput.nextInt();

        System.out.printf("How many pizzas do you have? ");
        pizzas = userInput.nextInt();


        System.out.printf("How many slices per pizza? ");
        slices = userInput.nextInt();

        // Slice Calculations
        sliceTotal = slices * pizzas;

        if (sliceTotal % people != 0) {
            // Remainder calc
            remainder = sliceTotal % people;
            slicePerPerson = (sliceTotal - remainder) / people;

        }
        else
        {
            remainder = 0;
            slicePerPerson = sliceTotal / people;
        }

        // Output
        System.out.println(people + " people with " + pizzas + " pizzas (" + sliceTotal + " slices)");
        System.out.println("Each person gets " + slicePerPerson + " pieces of pizza.");
        System.out.println("There are " + remainder + " leftover pieces.");
    }
}

