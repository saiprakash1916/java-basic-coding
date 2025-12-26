package Basic_Coding_Questions.NumberLogics;

import java.util.Scanner;

public class armStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digit = String.valueOf(number).length();
        while (number > 0) {
            int digits = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }
        if (sum == originalNumber) System.out.println(originalNumber + " is Arm Strong number");
        else System.out.println(originalNumber + " is not Arm Strong number");
    }
}
