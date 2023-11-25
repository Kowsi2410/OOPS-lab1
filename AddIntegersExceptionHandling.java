/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication76;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddIntegersExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = readIntegerInput(scanner);

            System.out.print("Enter the second integer: ");
            int num2 = readIntegerInput(scanner);

            int sum = num1+num2;//addIntegers(num1, num2);
            System.out.println("Sum of the two integers: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Exception: Please enter valid integers.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to read integer input with exception handling
    static int readIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Clear the buffer
                System.out.print("Exception: Please enter a valid integer. Try again: ");
            }
        }
    }

    // Method to add two integers
   // private static int addIntegers(int num1, int num2) {
   //     return num1 + num2;
  //  }
}
