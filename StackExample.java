
package javaapplication74;
import java.util.Scanner;

// Abstract class for Stack
abstract class AbstractStack {
    int maxSize;
    int top;
    int[] stackArray;

    public AbstractStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public abstract void push(int value);

    public abstract int pop();

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public String toString() {
        return "Stack: " + java.util.Arrays.toString(java.util.Arrays.copyOfRange(stackArray, 0, top + 1));
    }
}

// Concrete class extending AbstractStack
class IntegerStack extends AbstractStack {
    public IntegerStack(int size) {
        super(size);
    }

    @Override
    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        } else {
            System.out.println("Stack Overflow. Cannot push more elements.");
        }
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack.");
            return poppedValue;
        } else {
            System.out.println("Stack Underflow. Cannot pop from an empty stack.");
            return -1; // Assuming -1 represents an invalid value for this example
        }
    }
}

public class StackExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the size of the stack
        System.out.print("Enter the size of the stack: ");
        int stackSize = scanner.nextInt();

        // Create an instance of IntegerStack
        IntegerStack integerStack = new IntegerStack(stackSize);

        // Demonstrate stack operations based on user input
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (!integerStack.isFull()) {
                        System.out.print("Enter the value to push: ");
                        int valueToPush = scanner.nextInt();
                        integerStack.push(valueToPush);
                    } else {
                        System.out.println("Stack is full. Cannot push more elements.");
                    }
                    break;
                case 2:
                    if (!integerStack.isEmpty()) {
                        integerStack.pop();
                    } else {
                        System.out.println("Stack is empty. Cannot pop from an empty stack.");
                    }
                    break;
                case 3:
                    System.out.println(integerStack);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
