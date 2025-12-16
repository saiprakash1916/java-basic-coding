package Basic_Coding_Questions.StringManipulation;

import java.util.Scanner;

/* Reverse a string without using StringBuffer/StringBuilder. */

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        char[] strArray = input.toCharArray();
        for (int i = input.length() - 1; i >= 0; i--){
            System.out.print(strArray[i]);
        }
    }
}
