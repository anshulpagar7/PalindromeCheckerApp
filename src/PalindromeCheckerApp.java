import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        showWelcomeMessage();
        checkPalindromeUsingCharArray();

    }

    public static void showWelcomeMessage() {
        System.out.println("Welcome to Palindrome Checker Application");
    }

    public static void checkPalindromeUsingCharArray() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}