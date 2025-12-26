package Basic_Coding_Questions.StringManipulation;

/* Reverse characters of each word in a sentence. */

import java.util.Scanner;

public class reversCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        char[] strChar = input.toCharArray();
        String reverse = "";

        // Normal approach
        for (int i = strChar.length - 1; i >= 0; i--){
            reverse = reverse + strChar[i];
        }
        System.out.println("Reverse String is: " + reverse);

        // By using StringBuilder
        StringBuilder stringBuilder = new StringBuilder(input);
        System.out.println("Reversed String by using StringBuilder: " + stringBuilder.reverse());

    }
}
