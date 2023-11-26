/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication86;
import java.util.Scanner;

public class ArrayElementSwapper {

    // Generic method to swap elements in an array
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Invalid indices. Please enter valid indices within the array bounds.");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array of type Integer (you can change it to any other type)
        Integer[] array = new Integer[size];

        // Input elements from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        System.out.print("Enter the index of the first element to swap: ");
        int index1 = scanner.nextInt();

        System.out.print("Enter the index of the second element to swap: ");
        int index2 = scanner.nextInt();

        // Call the generic method to swap elements
        swapElements(array, index1, index2);

        // Display the array after swapping
        System.out.println("Array after swapping:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nEnter the size of the string array: ");
        int strSize = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] strArray = new String[strSize];

        for (int i = 0; i < strSize; i++) {
            System.out.print("Enter string element at index " + i + ": ");
            strArray[i] = scanner.nextLine();
        }

        System.out.print("Enter the index of the first string element to swap: ");
        int strIndex1 = scanner.nextInt();

        System.out.print("Enter the index of the second string element to swap: ");
        int strIndex2 = scanner.nextInt();

        // Call the generic method to swap elements in the string array
        swapElements(strArray, strIndex1, strIndex2);

        // Display the string array after swapping
        System.out.println("String array after swapping:");
        for (int i = 0; i < strSize; i++) {
            System.out.print(strArray[i] + " ");
        }

        scanner.close();
        
    }
}
