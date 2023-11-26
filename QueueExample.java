/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication90;
import java.util.Scanner;

// Define the interface for QueueOperations
interface QueueOperations {
    void enqueue(int element);
    int dequeue();
    void display();
}

// Implement the interface in the MyQueue class
class MyQueue implements QueueOperations {
    private static final int MAX_SIZE = 5;
    private int[] queueArray;
    private int front;
    private int rear;

    // Constructor to initialize the queue
    public MyQueue() {
        queueArray = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    // Implement the enqueue method from the interface
    @Override
    public void enqueue(int element) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full. Cannot enqueue element " + element);
        } else {
            if (front == -1) {
                // If the queue is empty, set front to 0
                front = 0;
            }
            // Increment rear and add the element to the queue
            queueArray[++rear] = element;
            System.out.println("Enqueued: " + element);
        }
    }

    // Implement the dequeue method from the interface
    @Override
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int dequeuedElement = queueArray[front++];
            if (front > rear) {
                // Reset front and rear when the queue becomes empty
                front = -1;
                rear = -1;
            }
            System.out.println("Dequeued: " + dequeuedElement);
            return dequeuedElement;
        }
    }

    // Implement the display method from the interface
    @Override
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
}

// Main class to get input from the user and perform operations on the queue
public class QueueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of MyQueue
        MyQueue myQueue = new MyQueue();

        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int elementToEnqueue = scanner.nextInt();
                    myQueue.enqueue(elementToEnqueue);
                    break;
                case 2:
                    myQueue.dequeue();
                    break;
                case 3:
                    myQueue.display();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
