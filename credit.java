
package javaapplication71;
import java.util.Scanner;

// Interface for CreditCardInterface
interface CreditCardInterface {
    void viewCreditAmount();
    void viewPin();
    void changePin(int newPin);
    void payBalance(double amount);
}

// Class implementing the CreditCardInterface interface
class Customer implements CreditCardInterface {
    String name;
    String cardNumber;
    int pin;
    double creditAmount;

    // Constructor to initialize the customer
    public Customer(String name, String cardNumber, int pin) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.creditAmount = 0.0;
    }

    // Method to view credit amount
    @Override
    public void viewCreditAmount() {
        System.out.println("Credit Amount: $" + creditAmount);
    }

    // Method to view PIN
    @Override
    public void viewPin() {
        System.out.println("PIN: " + pin);
    }

    // Method to change PIN
    @Override
    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN changed successfully.");
    }

    // Method to pay balance
    @Override
    public void payBalance(double amount) {
        if (amount > 0) {
            creditAmount -= amount;
            System.out.println("Balance paid successfully. Remaining Credit Amount: $" + creditAmount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
}

public class credit{
    public static void main(String[] args) {
        // Create an array of customer objects
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("John Doe", "1234-5678-9012-3456", 1234);
        customers[1] = new Customer("Jane Smith", "9876-5432-1098-7654", 5678);
        customers[2] = new Customer("Bob Johnson", "1111-2222-3333-4444", 9999);

        Scanner scanner = new Scanner(System.in);

        // Perform actions on customer objects
        for (Customer customer : customers) {
            System.out.println("\nCustomer: " + customer.name);
            customer.viewCreditAmount();

            // Pay Balance
            System.out.print("Enter amount to pay: $");
            double amountToPay = scanner.nextDouble();
            customer.payBalance(amountToPay);

            // Change Pin
            System.out.print("Enter new PIN: ");
            int newPin = scanner.nextInt();
            customer.changePin(newPin);

            // View updated information
            customer.viewCreditAmount();
            customer.viewPin();
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
