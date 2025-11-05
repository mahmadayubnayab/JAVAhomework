import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        System.out.println("What is the result of " + num1 + " - " + num2 + " = ?");
        int userResult = input.nextInt();

        int programResult = num1 - num2;

        if (userResult == programResult) {
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Your answer is incorrect. The correct result is " + programResult + ".");
        }

        input.close();
    }
}
