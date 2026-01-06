package Basic_Coding_Questions.NumberLogics;

import java.util.Scanner;

/* Find the sum of digits of a number. */

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Sum of all digits is :" + sum);
    }
}
