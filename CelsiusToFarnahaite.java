import java.util.Scanner;

public class CelsiusToFarnahaite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter any number of celsius");
        double celsius = input.nextDouble();
        double farnahaite = (9 * celsius / 5) + 32;

        System.out.println(celsius + " Celsius is equal to " + farnahaite + " Fahrenheit");

        input.close();
    }
}
