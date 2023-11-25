/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication67;
import java.util.Scanner;

public class CountNumbersWithDigit5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Validate that n is a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer for n.");
        } else {
            // Count numbers with the digit 5
            int count = countNumbersWithDigit5(n);

            // Display the result
            System.out.println("The number of integers from 1 to " + n + " with the digit 5: " + count);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to count numbers with the digit 5
    private static int countNumbersWithDigit5(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (hasDigit5(i)) {
                count++;
            }
        }

        return count;
    }

    // Function to check if a number has the digit 5
    private static boolean hasDigit5(int number) {
        while (number > 0) {
            if (number % 10 == 5) {
                return true;
            }
            number /= 10;
        }

        return false;
    }
}
