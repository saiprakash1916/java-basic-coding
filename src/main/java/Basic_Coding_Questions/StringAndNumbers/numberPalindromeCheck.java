package Basic_Coding_Questions.StringAndNumbers;

/*
 * Check whether a number is a palindrome without converting it to a string.
 */

import java.util.Scanner;

public class numberPalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome or NOT: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversed = 0;
        while (number > 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if (originalNumber == reversed) System.out.println(originalNumber + " is palindrome");
        else System.out.println(originalNumber + " is not a palindrome");
    }
}
