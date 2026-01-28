package Basic_Coding_Questions.NumberLogics;

/* Find factorial of a number (iterative & recursive). */

import java.math.BigInteger;
import java.util.Scanner;

public class factorialOfNumber {
    // By using iterative
    static void iterativeFactorials(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    // By using iterative BigInteger
    static void iterativeFactorialsBigInteger(int number){
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= number; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    // By using recursive
    static long recursiveFactorial(int number) {
        if (number == 0 || number == 1) return 1;
        return number * recursiveFactorial(number - 1);
    }

    // By using recursive BigInteger

    static BigInteger recursiveFactorialBigInteger(int number) {
        if (number == 0 || number == 1) return BigInteger.ONE;
        return BigInteger.valueOf(number).multiply(recursiveFactorialBigInteger(number - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find factorials: ");
        int number = scanner.nextInt();
        iterativeFactorials(number);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            System.out.println("Factorial of " + number + " is: " + recursiveFactorial(number));
        }

        System.out.println("--- By using BigInteger ------");
        iterativeFactorialsBigInteger(number);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            System.out.println("Factorial of " + number + " is: " + recursiveFactorialBigInteger(number));
        }
    }
}
