package Basic_Coding_Questions.StringManipulation;

import java.util.Scanner;

/* Reverse a string without using StringBuffer/StringBuilder. */

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        char[] inputArray = input.toCharArray();
        int left = 0;
        int right = inputArray.length - 1;
        while (left < right){
            char temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
            left ++;
            right --;
        }
        System.out.println("Reversed String: " + new String(inputArray));
    }
}
