package Basic_Coding_Questions.StringAndNumbers;


import java.util.Scanner;

/*
 * Check whether a given string is a palindrome without using reverse methods.
 */

public class stringPalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String to check palindrome or Not: ");
        String input = scanner.nextLine();
        String originalString = input.toLowerCase().replaceAll("\\s+", "");
        String reversString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversString = reversString + originalString.charAt(i);
        }
        if (originalString.equals(reversString)) System.out.println(originalString + " is Palindrome");
        else System.out.println(originalString + " is NOT a Palindrome");
    }
}
