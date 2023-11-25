
package javaapplication81;
        import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounts {
    public static void main(String[] args) {
        // Check if file names are provided as command-line arguments
        if (args.length == 0) {
            System.out.println("Usage: java LineCounts <file1> <file2> ...");
            return;
        }

        // Process each file specified in the command line
        for (String fileName : args) {
            try {
                int lineCount = countLines(fileName);
                System.out.println("File: " + fileName + ", Line Count: " + lineCount);
            } catch (IOException e) {
                System.out.println("Error reading file " + fileName + ": " + e.getMessage());
            }
        }
    }

    // Method to count lines in a file
    private static int countLines(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            return lineCount;
        }
    }
}

    
     

