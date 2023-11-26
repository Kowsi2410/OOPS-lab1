/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication87;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximalElementFinder {

    // Generic method to find the maximal element in the range [begin, end] of a list
    public static <T extends Comparable<T>> T findMaximalElement(List<T> list, int begin, int end) {
        if (list == null || list.isEmpty() || begin < 0 || end >= list.size() || begin > end) {
            throw new IllegalArgumentException("Invalid input. Please provide a valid list and range.");
        }

        T maxElement = list.get(begin);

        for (int i = begin + 1; i <= end; i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input list
        List<Integer> integerList = new ArrayList<>();

        System.out.print("Enter the size of the list: ");
        int listSize = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < listSize; i++) {
            System.out.print("Enter integer element at index " + i + ": ");
            integerList.add(scanner.nextInt());
            scanner.nextLine(); // Consume the newline character
        }

        // Input range
        System.out.print("Enter the beginning index of the range: ");
        int beginIndex = scanner.nextInt();

        System.out.print("Enter the ending index of the range: ");
        int endIndex = scanner.nextInt();

        try {
            // Call the generic method to find the maximal element in the range
            Integer maximalElement = findMaximalElement(integerList, beginIndex, endIndex);

            // Display the result
            System.out.println("Maximal element in the range [" + beginIndex + ", " + endIndex + "]: " + maximalElement);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
