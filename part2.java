import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        Scanner varyy = new Scanner(System.in);

        try {
            System.out.print("Enter the first string: ");
            String firstString = validateString(varyy.nextLine());

            System.out.print("Enter the second string: ");
            String secondString = validateString(varyy.nextLine());

            int firstStringLength = firstString.length();
            String concatenatedString = firstString.concat(secondString);
            String reversedFirstString = reverseString(firstString);
            String reversedSecondString = reverseString(secondString);

            System.out.println("Length of the first string: " + firstStringLength);
            System.out.println("Concatenated string: " + concatenatedString);
            System.out.println("Reversed first string: " + reversedFirstString);
            System.out.println("Reversed second string: " + reversedSecondString);
        } catch (NullPointerException e) {
            System.out.println("Error: String should not be null.");
        }
    }

    private static String validateString(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        return str;
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
