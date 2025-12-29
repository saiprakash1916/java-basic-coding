package Basic_Coding_Questions.NumberLogics;

import java.util.Scanner;

/* Print all prime numbers between 1 and N. */

public class printPrimeNumbers {

    static boolean isPrime(int number){
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i * i <= number; i += 2){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    static void primeNumberRange(int number){
        System.out.println("Prime numbers between 1 and " + number + ":");

        for (int i = 2; i <= number; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print between prime numbers: ");
        int number = scanner.nextInt();
        primeNumberRange(number);
    }
}
