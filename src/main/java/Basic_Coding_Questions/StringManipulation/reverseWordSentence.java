package Basic_Coding_Questions.StringManipulation;

/* Reverse words in a sentence but not the characters. */

import java.util.Scanner;

public class reverseWordSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        String result = "";

        // Normal approach
        for (int i = words.length - 1; i >= 0; i--){
            result = result + words[i] + " ";
        }
        System.out.println("Reverse word is: " + result);

        // By using String Builder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--){
            stringBuilder.append(words[i]).append(" ");
        }
        System.out.println("Reverse word by using String Builder: " + result);
    }
}
