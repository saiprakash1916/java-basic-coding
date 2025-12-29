package Basic_Coding_Questions.NumberLogics;

/* Check whether a number is prime. */

import java.util.Scanner;
import java.util.stream.IntStream;

public class primeNumberCheck {

    // By using normal approach
    static boolean checkPrimeNumber(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // By using java 8
    static boolean isPrime(int number){
        if (number <= 1) return false;

        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i ==0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check prime or NOT: ");
        int number = scanner.nextInt();
        System.out.println("-------  By using normal approach ----------");
        if (checkPrimeNumber(number)) {
            System.out.println(number + " is a prime Number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        System.out.println();
        System.out.println("-------  By using java 8 ----------");
        if (isPrime(number)) {
            System.out.println(number + " is a prime Number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
