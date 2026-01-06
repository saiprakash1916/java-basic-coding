package Basic_Coding_Questions.ArraysAndCollections;

/* Find the second-largest element in an array. */

import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the How many elements in the array: ");
        int count = scanner.nextInt();
        if (count < 2){
            System.out.println("Need at least two elements");
            return;
        }
        int[] numbers = new int[count];
        System.out.println("Enter the " + count + " numbers: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        int larget = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : numbers){
            if (num > larget){
                secondLargest = larget;
                larget = num;
            }else if(num > secondLargest && num != larget){
                secondLargest = num;
            }
        }
        System.out.println("First largest number is " + larget);
        System.out.println("Second largest number is " + secondLargest);
    }
}
