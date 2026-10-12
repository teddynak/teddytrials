import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();

        // Arithmetic operators
        System.out.println("\nArithmetic Operations");
        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));

        if (secondNumber != 0) {
            System.out.println("Division: " + (firstNumber / secondNumber));
            System.out.println("Remainder: " + (firstNumber % secondNumber));
        } else {
            System.out.println("Division: Cannot divide by zero");
            System.out.println("Remainder: Cannot divide by zero");
        }

        // Relational operator
        System.out.println("First number greater than second: " + (firstNumber > secondNumber));

        // Logical operator
        System.out.println("Both numbers are positive: " + (firstNumber > 0 && secondNumber > 0));

        // Assignment operator
        int assignmentResult = firstNumber;
        assignmentResult += secondNumber;
        System.out.println("Result using += : " + assignmentResult);

        // Ternary operator
        String equality = (firstNumber == secondNumber) ? "Equal" : "Not Equal";
        System.out.println("Comparison: " + equality);

        // Bitwise operator
        System.out.println("Bitwise AND (&): " + (firstNumber & secondNumber));

        input.close();
    }
}
