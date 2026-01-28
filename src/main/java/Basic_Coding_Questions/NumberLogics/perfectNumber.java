package Basic_Coding_Questions.NumberLogics;

/* Check whether a number is perfect number. */

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        if (sum == number && number > 0) System.out.println(number + " is a perfect number");
        else System.out.println(number + " is not perfect number");
    }
}
