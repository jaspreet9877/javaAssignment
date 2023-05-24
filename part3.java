import java.util.Scanner;

public class part3 {
    public static void main(String[] args) {
        Scanner button = new Scanner(System.in);

        int palindromeCount = 0;
        int nonPalindromeCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a string: ");
            String inputString = button.nextLine();

            if (isPalindrome(inputString)) {
                System.out.println("Palindrome!");
                palindromeCount++;
            } else {
                System.out.println("Not a palindrome!");
                nonPalindromeCount++;
            }
        }

        System.out.println("Palindrome count: " + palindromeCount);
        System.out.println("Non-palindrome count: " + nonPalindromeCount);
    }

    private static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
