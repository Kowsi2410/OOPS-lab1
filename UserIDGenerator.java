/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication66;
import java.util.Scanner;

public class UserIDGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for full name and street address
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your street address: ");
        String streetAddress = scanner.nextLine();

        // Generate the ID based on initials and numeric part of the address
        String userID = generateUserID(fullName, streetAddress);

        // Display the generated ID
        System.out.println("Your ID: " + userID);

        // Close the scanner
        scanner.close();
    }

    // Function to generate the user ID
    private static String generateUserID(String fullName, String streetAddress) {
        // Extract initials from the full name
        String[] nameParts = fullName.split(" ");
        StringBuilder initials = new StringBuilder();

        for (String part : nameParts) {
            if (!part.isEmpty()) {
                initials.append(part.charAt(0));
            }
        }

        // Extract numeric part from the address
        String numericPart = streetAddress.replaceAll("[^0-9]", "");

        // Combine initials and numeric part to form the ID
        return initials.toString().toUpperCase() + numericPart;
    }
}
