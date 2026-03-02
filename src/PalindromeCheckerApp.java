import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        showWelcomeMessage();
        checkPalindromeUsingQueueAndStack();

    }

    public static void showWelcomeMessage() {
        System.out.println("Welcome to Palindrome Checker Application");
    }

    public static void checkPalindromeUsingQueueAndStack() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both stack and queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);        // LIFO
            queue.add(ch);         // FIFO
        }

        boolean isPalindrome = true;

        // Compare pop (stack) vs dequeue (queue)
        for (int i = 0; i < input.length(); i++) {

            char fromStack = stack.pop();     // Last In First Out
            char fromQueue = queue.remove();  // First In First Out

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}