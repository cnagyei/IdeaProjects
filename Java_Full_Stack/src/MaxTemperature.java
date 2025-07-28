/*
Celsius Chase: Climbing to a Fiery Halt

Write a Java program that reads a sequence of temperature readings in degrees Celsius
until a reading of 100 degrees or more is encountered. Your program should output the
highest temperature reading observed up to that point. You must take input as a sequence
of integer temperature values and print the highest value before the stopping condition.

HINT: Assume you are dealing only with positive temperatures.
 */

import java.util.Scanner;

public class MaxTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed
        int temperature;

        // Add your while loop or do-while loop here to process input temperatures
        do {
            temperature = scanner.nextInt();
            maxTemperature = temperature < 100 ? Math.max(temperature, maxTemperature) : maxTemperature;
        } while (temperature < 100);

        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}