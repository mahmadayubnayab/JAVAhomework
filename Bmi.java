import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your weight");
        float weight = input.nextFloat();

        System.out.println("enter your height");
        float height = input.nextFloat();

        float bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("you are underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("your body is normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("you are overweight");
        } else if (bmi >= 30) {
            System.out.println("you are obese");
        }

        input.close();
    }
}
