/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication82;
import java.util.Scanner;

public class MinMaxFinder<T extends Comparable<T>> {

    public void findMinMax(T[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        T min = array[0];
        T max = array[0];

        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }

            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        Integer[] integerArray = new Integer[n];
        Double[] doubleArray = new Double[n];
        String[] stringArray = new String[n];

        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            integerArray[i] = scanner.nextInt();
        }

        System.out.println("Enter doubles:");
        for (int i = 0; i < n; i++) {
            doubleArray[i] = scanner.nextDouble();
        }

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        MinMaxFinder<Integer> integerMinMaxFinder = new MinMaxFinder<>();
        System.out.println("For integers:");
        integerMinMaxFinder.findMinMax(integerArray);

        MinMaxFinder<Double> doubleMinMaxFinder = new MinMaxFinder<>();
        System.out.println("For doubles:");
        doubleMinMaxFinder.findMinMax(doubleArray);

        MinMaxFinder<String> stringMinMaxFinder = new MinMaxFinder<>();
        System.out.println("For strings:");
        stringMinMaxFinder.findMinMax(stringArray);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
