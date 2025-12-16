package interviewPoint;

import java.util.Scanner;

/*
Scanner reads everything as String.
Numbers are treated as character sequences.
We compare characters from start and end using two pointers.
No extra memory or reverse function used.
*/

public class palindromeCheck {
    static boolean palindrome(String input) {
        String removedSpaces = input.toLowerCase().replaceAll("\\s+", "");
        int left = 0;
        int right = removedSpaces.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String or Number: ");
        String input = scanner.nextLine();

        boolean isPalindrome = palindrome(input);

        if (isPalindrome) System.out.println(input + " is a palindrome");
        else System.out.println(input + " is NOT a palindrome");
    }
}
