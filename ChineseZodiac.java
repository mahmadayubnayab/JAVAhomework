import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a year please");
        int year = input.nextInt();

        int zodiac = year % 12;

        if (zodiac == 0) {
            System.out.println("this is monkey year");
        } else if (zodiac == 1) {
            System.out.println("this is rooster year");
        } else if (zodiac == 2) {
            System.out.println("this is dog year");
        } else if (zodiac == 3) {
            System.out.println("this is pig year");
        } else if (zodiac == 4) {
            System.out.println("this is rat year");
        } else if (zodiac == 5) {
            System.out.println("this is ox year");
        } else if (zodiac == 6) {
            System.out.println("this is tiger year");
        } else if (zodiac == 7) {
            System.out.println("this is rabbit year");
        } else if (zodiac == 8) {
            System.out.println("this is dragon year");
        } else if (zodiac == 9) {
            System.out.println("this is snake year");
        } else if (zodiac == 10) {
            System.out.println("this is horse year");
        } else if (zodiac == 11) {
            System.out.println("this is sheep year");
        }

        input.close();
    }
}
