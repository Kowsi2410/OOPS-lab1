package javaapplication85;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountOddInteger {
    
    /**
     *
     * @param args
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the list
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        // Create a list to store integers
        List<Integer> integerList = new ArrayList<>();

        // Get input from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            integerList.add(scanner.nextInt());
        }
        int oddCount = OddIntegers(integerList);

        // Display the result
        System.out.println("Number of odd integers: " + oddCount);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    public static <T extends Number> int OddIntegers(List<T> numbers) {
        int count = 0;
        for (T number : numbers) {
            if (number.intValue() % 2 != 0) {
                count++;
              //  System.out.println(count);
            }
        }
        return count;
    }

 /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the list
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        // Create a list to store integers
        List<Integer> integerList = new ArrayList<>();

        // Get input from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            integerList.add(scanner.nextInt());
        }

        // Call the generic method to count odd integers
        int oddCount = countOddIntegers(integerList);

        // Display the result
        System.out.println("Number of odd integers: " + oddCount);

        // Close the scanner to avoid resource leak
        scanner.close();
}*/
}
