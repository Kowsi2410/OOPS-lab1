/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication73;
import java.util.Scanner;

public class EmailAddressGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input containing first name and last name
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        // Computing email address
        String emailPrefix = firstName.substring(0, Math.min(3, firstName.length())) +"."+
                             lastName.substring(0, Math.min(4, lastName.length()));
        String emailAddress = emailPrefix.toLowerCase() + "@gmail.com";

        System.out.println("Computed Email Address: " + emailAddress);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
