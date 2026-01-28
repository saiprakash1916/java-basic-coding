package Basic_Coding_Questions.NumberLogics;

import java.util.Scanner;

/* Reverse a number without using string conversion. */

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reverse = 0;
        while (number > 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number is: " + reverse);
    }
}
