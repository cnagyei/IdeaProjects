/*
Hiring a chef

Imagine that you are an HR manager at a restaurant and you need to hire a chef. To do that, you need to collect some preliminary data about the candidates.

You have a special form for the candidates that includes 3 fields: first name, years of experience and cuisine preference.

Your program should read all the words (or numbers) from the three lines and output "The form for first name is completed. We will contact you if we need a chef who cooks cuisine preference dishes and has years of experience years of experience."

Pay attention to the output format, you need to match the spacing.

 */

import java.util.Scanner;

public class Chef {

    public static void main(String[] args) {
        // Use a Scanner to read user input
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        String cuisine = sc.next();
        int years_of_experience = sc.nextInt();


        // Calculate the total number of fruits and print the result
        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a " +
                "chef who cooks " + cuisine + " dishes and has " + years_of_experience + " years of experience.");
    }
}
