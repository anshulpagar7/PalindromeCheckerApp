import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // Two Pointer Method
    public static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Stack Method
    public static boolean stackCheck(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++)
            stack.push(input.charAt(i));

        for (int i = 0; i < input.length(); i++)
            if (input.charAt(i) != stack.pop())
                return false;

        return true;
    }

    // Deque Method
    public static boolean dequeCheck(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < input.length(); i++)
            deque.addLast(input.charAt(i));

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Two Pointer Timing
        long startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long endTime = System.nanoTime();
        long time1 = endTime - startTime;

        // Stack Timing
        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        // Deque Timing
        startTime = System.nanoTime();
        boolean result3 = dequeCheck(input);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Result: " + result3 + " | Time: " + time3 + " ns");
    }
}