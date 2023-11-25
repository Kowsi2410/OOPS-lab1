/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication75;
import java.util.Scanner;

// Custom exception for input "hello"
class HelloInputException extends Exception {
    public HelloInputException(String message) {
        super(message);
    }
}

public class HelloInputExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a word: ");
            String input = scanner.next();

            if ("hello".equalsIgnoreCase(input)) {
                throw new HelloInputException("Custom Exception: The input is 'hello'.");
            } else {
                System.out.println("Input is not 'hello'. Proceeding with other operations.");
            }
        } catch (HelloInputException e) {
            System.out.println(e.getMessage());
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
