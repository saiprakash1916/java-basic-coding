package lambdaExpressions;

import java.util.Scanner;

interface sumIntegers {
    int add(int a, int b);
}

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        sumIntegers sum = (a, b) -> a + b;
        System.out.println("Sum of " + num1 +" and " + num2 + " is " + sum.add(num1, num2));
    }
}
