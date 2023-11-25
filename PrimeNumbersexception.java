
package javaapplication78;
class PositiveIntegerException extends Exception {
    
public PositiveIntegerException(String message) {
super(message);
}
}
class SecondIntegerLargerException extends Exception {
public SecondIntegerLargerException(String message) {
super(message);
}
}
public class PrimeNumbersexception {
public static void main(String[] args) {
try {
int num1 = Integer.parseInt(args[0]);
int num2 = Integer.parseInt(args[1]);
if (num1 <= 0 || num2 <= 0) {
throw new PositiveIntegerException("Both numbers should be positive integers.");
}
if (num2 <= num1) {
throw new SecondIntegerLargerException("Second number should be larger than the first.");
}
System.out.println("Prime numbers between " + num1 + " and " + num2 + ":");
int flag;
for (int i = num1; i <= num2; i++) {

            if (i == 1 || i == 0)
                continue;
             flag = 1;
            for (int j = 2; j <= i / 2;j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
             System.out.println(i+" ");
        }

}
catch (NumberFormatException e) {
System.out.println("Exception: Please enter valid integers as arguments.");
} catch (PositiveIntegerException | SecondIntegerLargerException e) {
System.out.println("Exception: " + e.getMessage());
}
}}
