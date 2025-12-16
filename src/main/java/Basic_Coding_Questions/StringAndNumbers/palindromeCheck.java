package Basic_Coding_Questions.StringAndNumbers;

/* Write a program to check palindrome for both string and integer using one method. */

/*
Scanner reads everything as String.
Numbers are treated as character sequences.
We compare characters from start and end using two pointers.
No extra memory or reverse function used.
*/

import java.util.Scanner;

public class palindromeCheck {
    static boolean palindromeCheckForBothStringAndInteger(String input) {
        String removedSpaces = input.toLowerCase().replaceAll("\\s+", "");
        int left = 0;
        int right = removedSpaces.length();
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
        boolean isPalindrome = palindromeCheckForBothStringAndInteger(input);

        if (isPalindrome) System.out.println(input + " is a palindrome");
        else System.out.println(input + " is NOT a palindrome");
    }
}
