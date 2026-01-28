package Basic_Coding_Questions.NumberLogics;

/* Swap two numbers without using third variable. */

import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a Second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Before Swapping the number are " + number1 + " and " + number2);
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("After Swapping the number are " + number1 + " and " + number2);
    }
}
