
package javaapplication61;
import java.util.Scanner;

public class AcronymGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three words
        System.out.print("Enter three words: ");
        String input = scanner.nextLine();

        // Split the input into words
        String[] words = input.split("\\s+");

        // Ensure there are at least three words
        if (words.length >= 3) {
            // Form the acronym using the first letter of each word
            StringBuilder acronym = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                acronym.append(words[i].charAt(0));
            }

            // Display the acronym in uppercase
            System.out.println("Acronym: " + acronym.toString().toUpperCase());
        } else {
            System.out.println("Please enter at least three words.");
        }

        // Close the scanner
        scanner.close();
    }
}
