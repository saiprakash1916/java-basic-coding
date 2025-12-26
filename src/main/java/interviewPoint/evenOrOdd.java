package interviewPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the last number: ");
        int number2 = scanner.nextInt();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = number1; i <= number2; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        System.out.println("Even number are: " + evenList);
        System.out.println("Odd numbers are: " + oddList);
    }
}
