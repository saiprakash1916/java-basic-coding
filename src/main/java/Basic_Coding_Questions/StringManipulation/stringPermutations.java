package Basic_Coding_Questions.StringManipulation;

import java.util.Scanner;

/* Find all permutations of a string. */

public class stringPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        permute(input.toCharArray(), 0);
    }

    static void permute(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println(String.valueOf(arr));
            return;
        }
        for (int i = index; i <= arr.length - 1; i++) {
            swap(arr, index, i);
            permute(arr, index + 1);
            swap(arr, index, i);
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
