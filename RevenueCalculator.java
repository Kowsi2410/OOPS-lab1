/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication65;
import java.util.Scanner;

public class RevenueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter unit price and quantity
        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Calculate revenue without discount
        double revenue = unitPrice * quantity;

        // Apply discount based on quantity
        double discountRate = 0.0;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.10;
        } else if (quantity > 120) {
            discountRate = 0.15;
        }

        // Calculate discounted revenue
        double discountedRevenue = revenue - (revenue * discountRate);

        // Display the results
        System.out.println("Revenue without discount: $" + revenue);
        System.out.println("Discount rate: " + (discountRate * 100) + "%");
        System.out.println("Discounted revenue: $" + discountedRevenue);

        // Close the scanner
        scanner.close();
    }
}



