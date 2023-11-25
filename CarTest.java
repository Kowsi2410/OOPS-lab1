/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication70;
import java.util.Scanner;

abstract class Car {
    String reg_no;
    String model;
    String reg_date;

    public Car(String reg_no, String model, String reg_date) {
        this.reg_no = reg_no;
        this.model = model;
        this.reg_date = reg_date;
    }

    abstract void displayDetails();
}

class TransportVehicle extends Car {
    String validity_no;
    String start_date;
    int period;

    public TransportVehicle(String reg_no, String model, String reg_date, String validity_no, String start_date, int period) {
        super(reg_no, model, reg_date);
        this.validity_no = validity_no;
        this.start_date = start_date;
        this.period = period;
    }

    @Override
    void displayDetails() {
        System.out.println("Transport Vehicle Details:");
        System.out.println("Registration Number: " + reg_no);
        System.out.println("Model: " + model);
        System.out.println("Registration Date: " + reg_date);
        System.out.println("Validity Number: " + validity_no);
        System.out.println("Start Date: " + start_date);
        System.out.println("Period: " + period + " years");
        System.out.println("------------------------");
    }
}

class PrivateVehicle extends Car {
    String owner_name;
    String owner_address;

    public PrivateVehicle(String reg_no, String model, String reg_date, String owner_name, String owner_address) {
        super(reg_no, model, reg_date);
        this.owner_name = owner_name;
        this.owner_address = owner_address;
    }

    @Override
    void displayDetails() {
        System.out.println("Private Vehicle Details:");
        System.out.println("Registration Number: " + reg_no);
        System.out.println("Model: " + model);
        System.out.println("Registration Date: " + reg_date);
        System.out.println("Owner Name: " + owner_name);
        System.out.println("Owner Address: " + owner_address);
        System.out.println("------------------------");
    }
}

public class CarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();

        Car[] vehicles = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter vehicle type (1 for Transport Vehicle, 2 for Private Vehicle): ");
            int vehicleType = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter Registration Number: ");
            String reg_no = scanner.nextLine();
            System.out.print("Enter Model: ");
            String model = scanner.nextLine();
            System.out.print("Enter Registration Date: ");
            String reg_date = scanner.nextLine();

            if (vehicleType == 1) {
                System.out.print("Enter Validity Number: ");
                String validity_no = scanner.nextLine();
                System.out.print("Enter Start Date: ");
                String start_date = scanner.nextLine();
                System.out.print("Enter Period: ");
                int period = scanner.nextInt();

                vehicles[i] = new TransportVehicle(reg_no, model, reg_date, validity_no, start_date, period);
            } else if (vehicleType == 2) {
                System.out.print("Enter Owner Name: ");
                String owner_name = scanner.nextLine();
                System.out.print("Enter Owner Address: ");
                String owner_address = scanner.nextLine();

                vehicles[i] = new PrivateVehicle(reg_no, model, reg_date, owner_name, owner_address);
            } else {
                System.out.println("Invalid vehicle type. Please enter 1 for Transport Vehicle or 2 for Private Vehicle.");
                i--; // Decrement i to repeat the current iteration
            }
        }

        // Display details of all vehicles
        for (Car vehicle : vehicles) {
            vehicle.displayDetails();
        }
    }
}
