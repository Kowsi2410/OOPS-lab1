/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication64;

import java.util.Scanner;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String phoneNumber = "";
        
        while (!phoneNumber.equals("999")) {
            System.out.print("Enter a 10-digit number (or 999 to exit): ");
            phoneNumber = scanner.nextLine();
            
            if (phoneNumber.length() == 10) {
                String formattedNumber = "(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
                System.out.println("Formatted phone number: " + formattedNumber);
            } else if (!phoneNumber.equals("999")) {
                System.out.println("Error: Please enter exactly 10 digits.");
            }
        }
        
        System.out.println("Exiting the program. Have a great day!");
    }
}
