import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        showWelcomeMessage();
        checkPalindromeUsingReverse();

    }

    public static void showWelcomeMessage() {
        System.out.println("Welcome to Palindrome Checker Application");
    }

    public static void checkPalindromeUsingReverse() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}