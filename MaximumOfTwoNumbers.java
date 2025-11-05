// Exercise 8: Maximum of Two Numbers
// Write a Java program to find the maximum of two numbers using conditional statements.

import java.util.Scanner;

public class MaximumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + " is maximum.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is maximum.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
