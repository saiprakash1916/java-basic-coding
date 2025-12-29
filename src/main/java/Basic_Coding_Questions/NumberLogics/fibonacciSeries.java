package Basic_Coding_Questions.NumberLogics;

import java.util.Scanner;

/* Find Fibonacci series */
public class fibonacciSeries {

    static int fibonacci(int number){
        if (number <= 1) return number;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to get the Fibonacci series: ");
        int number = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci series by using Iterative");
        for (int i = 0; i <= number; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        System.out.println("Fibonacci series by using Recursive");
        for (int i = 0; i <= number; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
