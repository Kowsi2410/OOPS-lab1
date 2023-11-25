/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication77;

import java.util.Scanner;

// Custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
// Doctor class
class Doctor {
    int id;
    String name;
    int age;
    String department;

    // Parameterized constructor
    public Doctor(int id, String name, int age, String department) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 25 || age > 65) {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException: Age should be between 25 and 65.");
        } else {
            this.age = age;
        }

        if (!isValidName(name)) {
            throw new NameNotValidException("NameNotValidException: Name should not contain numbers or special symbols.");
        } else {
            this.name = name;
        }

        this.id = id;
        this.department = department;
    }

    // Check if the name is valid (does not contain numbers or special symbols)
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // Display Doctor information
    public void displayInfo() {
        System.out.println("Doctor Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class DoctorExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from the user
            System.out.print("Enter Doctor ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter Doctor Name: ");
            String name = scanner.next();

            System.out.print("Enter Doctor Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Doctor Department: ");
            String department = scanner.next();

            // Create Doctor object with exception handling
            Doctor doctor = new Doctor(id, name, age, department);

            // Display Doctor information
            doctor.displayInfo();

        } catch (NameNotValidException | AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
