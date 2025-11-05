import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your phone number");
        String number = input.nextLine();

        if (number.startsWith("070")) {
            System.out.println("your number is afghan bisim");
        } else if (number.startsWith("079")) {
            System.out.println("your number is roshan");
        } else if (number.startsWith("078")) {
            System.out.println("your number is etisalat");
        } else if (number.startsWith("074")) {
            System.out.println("your number is salam");
        } else {
            System.out.println("your number is wrong");
        }

        input.close();
    }
}
