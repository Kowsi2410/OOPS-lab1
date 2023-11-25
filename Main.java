/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication68;
import java.util.Scanner;

// Interface for QueueOperations
interface QueueOperations {
    void enqueue(int data);
    int dequeue();
    void display();
}

// Class implementing the QueueOperations interface
class MyQueue implements QueueOperations {
    private static final int MAX_SIZE = 10; // Maximum size of the queue
    private int[] queueArray;
    private int front;
    private int rear;

    // Constructor to initialize the queue
    public MyQueue() {
        queueArray = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    // Method to enqueue (insert) an element into the queue
    public void enqueue(int data) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full. Cannot enqueue more elements.");
        } else {
            if (front == -1) {
                front = 0;
            }
            queueArray[++rear] = data;
            System.out.println(data + " enqueued into the queue.");
        }
    }

    // Method to dequeue (remove) an element from the queue
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty. Cannot dequeue from an empty queue.");
            return -1; // Assuming -1 represents an invalid value for this example
        } else {
            int dequeuedElement = queueArray[front++];
            if (front > rear) {
                front = rear = -1; // Reset the queue when it becomes empty
            }
            System.out.println(dequeuedElement + " dequeued from the queue.");
            return dequeuedElement;
        }
    }

    // Method to display the elements of the queue
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyQueue queue = new MyQueue();

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int enqueueData = scanner.nextInt();
                    queue.enqueue(enqueueData);
                    break;
                case 2:
                    int dequeuedElement = queue.dequeue();
                    if (dequeuedElement != -1) {
                        System.out.println("Dequeued element: " + dequeuedElement);
                    }
                    break;
                case 3:
                    queue.display();
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
