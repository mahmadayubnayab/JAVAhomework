import java.util.Scanner;

public class AnImproveMathLearningTools {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain;

        do {
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

            System.out.print("Do you want to try another question? (yes/no): ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for practicing! Goodbye.");
        input.close();
    }
}
