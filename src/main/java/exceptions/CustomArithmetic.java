package exceptions;

import java.util.Scanner;

public class CustomArithmetic {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter the Second number: ");
            int number2 = scanner.nextInt();
            if (number2 == 0) {
                throw new ArithmeticException("Zero cannot divisible by number..");
            } else {
                int output = number1 / number2;
                System.out.println("Output is: " + output);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
