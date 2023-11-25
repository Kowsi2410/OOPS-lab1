/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication69;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Result extends Student {
    int marksSubject1, marksSubject2, marksSubject3;

    public Result(String name, int rollNo) {
        super(name, rollNo);
    }

    public void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for Subject 1 for " + name + ":");
        this.marksSubject1 = scanner.nextInt();
        System.out.println("Enter marks for Subject 2 for " + name + ":");
        this.marksSubject2 = scanner.nextInt();
        System.out.println("Enter marks for Subject 3 for " + name + ":");
        this.marksSubject3 = scanner.nextInt();
    }

    public int calculateTotalMarks() {
        return marksSubject1 + marksSubject2 + marksSubject3;
    }

    public void displayResult() {
        int totalMarks = calculateTotalMarks();
        System.out.println(name + " with Roll No. " + rollNo + " has scored " + totalMarks + " marks.");
        if (totalMarks >= 100) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

class Sports extends Result {
    int sportsPoints;

    public Sports(String name, int rollNo) {
        super(name, rollNo);
    }

    public void getSportsPoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sports points for " + name + ":");
        this.sportsPoints = scanner.nextInt();
    }

    public void displaySportsPoints() {
        System.out.println(name + " has earned " + sportsPoints + " sports points.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array to store three student objects
        Sports[] students = new Sports[3];

        // Get input for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter roll number:");
            int rollNo = scanner.nextInt();

            students[i] = new Sports(name, rollNo);
            students[i].getMarks();
            students[i].getSportsPoints();
        }

        // Display results and sports points for each student
        for (Sports student : students) {
            student.displayResult();
            student.displaySportsPoints();
            System.out.println();
        }
    }
}
