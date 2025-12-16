package interviewPoint;

import java.util.Scanner;

public class palindromeNumber {
    static void palindromeByUsingStringBuilder(String input) {
        String original = String.valueOf(input);
        StringBuilder stringBuffer = new StringBuilder(original);
        String reversed = stringBuffer.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not palindrome");
        }
    }

    static void palindromeNumberOrNot(int number) {
        int originalNumber = number;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversed) System.out.println(originalNumber + " is palindrome number");
        else System.out.println(originalNumber + " is not palindrome number");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome or not: ");
        String input = scanner.next();
        palindromeByUsingStringBuilder(input);

        //int number = scanner.nextInt();
        //palindromeNumberOrNot(number);
    }
}
