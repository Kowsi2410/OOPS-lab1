/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication84;
import java.io.*;

public class ConvertCaseFiles {

    public static void main(String[] args) {
        // File paths
        String originalFilePath = "original.txt";  // File to store original content
        String convertedFilePath = "converted.txt";  // File to store converted content

        try {
            // Write content to the original file
            writeContent(originalFilePath);

            // Convert the content from the original file to lowercase and write to the converted file
            convertAndWrite(originalFilePath, convertedFilePath);

            System.out.println("Conversion completed. Check the converted file: " + convertedFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to write content in both uppercase and lowercase to a file
    private static void writeContent(String filePath) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("This is Original Content.");
            writer.println("It contains UPPERCASE and lowercase words.");
            writer.println("File for testing case conversion.");
        }
    }

    // Method to read from an input file, convert words to lowercase, and write to another file
    private static void convertAndWrite(String inputFilePath, String outputFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Convert each word to lowercase and write to the output file
                String[] words = line.split("\\s+");
                for (String word : words) {
                    writer.write(word.toLowerCase() + " ");
                }
                // Write a newline after processing each line
                writer.newLine();
            }
        }
    }
}
