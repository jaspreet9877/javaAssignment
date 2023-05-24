import java.util.Scanner;

public class part1{
    public static void main(String[] args) {
        Scanner battle = new Scanner(System.in);

        System.out.println("Enter three double numbers separated by spaces: ");
        double number1 = battle.nextDouble();
        double number2 = battle.nextDouble();
        double number3 = battle.nextDouble();

        double maximum = findMaximum(number1, number2, number3);

        System.out.println("The maximum number is: " + maximum);
    }

    public static double findMaximum(double num1, double num2, double num3) {
        double maximum = num1;

        if (num2 > maximum) {
            maximum = num2;
        }

        if (num3 > maximum) {
            maximum = num3;
        }

        return maximum;
    }
}
