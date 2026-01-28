package Basic_Coding_Questions.NumberLogics;

/* Find the largest digit in a number. */

import java.util.Scanner;

public class largestDigitInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int largestDigit = 0;
        while (number > 0){
            int digit = number % 10;
            if (digit > largestDigit){
                largestDigit = digit;
            }
            number /= 10;
        }
        System.out.println("Largest Digit in the given number is: " + largestDigit);
    }
}
