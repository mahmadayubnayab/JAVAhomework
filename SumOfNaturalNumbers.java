// Exercise 6: Sum of First N Natural Numbers
// Write a Java program that takes a number n and prints the sum of the first n natural numbers.

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = input.nextInt();

        int sum = (n * (n + 1)) / 2;
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
