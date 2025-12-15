package interviewPoint;

import java.util.Scanner;

public class armStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check Arm Strong number or not? ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }
        if (sum == originalNumber) System.out.println(originalNumber + " is Arm Strong number");
        else System.out.println(originalNumber + " is not Arm Strong number");
    }
}
