/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication72;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraySeparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the size of the array
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        // Create an array of the specified size and initialize values randomly between 10 and 90
        int[] integerArray = new int[arraySize];
        Random random = new Random();

        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            integerArray[i] = random.nextInt(81) + 10; // Values between 10 and 90
            sum += integerArray[i];
        }

        // Calculate the average
        double average = (double) sum / arraySize;

        // Separate values below and above average into ArrayLists
        ArrayList<Integer> belowAverageList = new ArrayList<>();
        ArrayList<Integer> aboveAverageList = new ArrayList<>();

        for (int value : integerArray) {
            if (value < average) {
                belowAverageList.add(value);
            } else {
                aboveAverageList.add(value);
            }
        }

        // Print the original array
        System.out.println("\nOriginal Array:");
        for (int value : integerArray) {
            System.out.print(value + " ");
        }

        // Print the below average values
        System.out.println("\n\nValues below average:");
        for (int value : belowAverageList) {
            System.out.print(value + " ");
        }

        // Print the above average values
        System.out.println("\n\nValues above average:");
        for (int value : aboveAverageList) {
            System.out.print(value + " ");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
