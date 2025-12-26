package Basic_Coding_Questions.StringManipulation;

import java.util.Scanner;

/* Check if a string contains only digits. */

public class stringContainsOnlyDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String to check: ");
        String input = scanner.nextLine();
        boolean isOnlyDigit = input.chars().allMatch(Character::isDigit);
        System.out.println(isOnlyDigit);
    }
}
