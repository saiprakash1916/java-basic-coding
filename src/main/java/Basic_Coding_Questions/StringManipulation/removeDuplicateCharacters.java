package Basic_Coding_Questions.StringManipulation;

/* Remove duplicate characters from a string. */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        input = input.toLowerCase().replaceAll("\\s+","");

        // By using StringBuilder and Set
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : input.toCharArray()){
            if (set.add(ch)){
                stringBuilder.append(ch);
            }
        }
        System.out.println("After remove duplicate characters by using StringBuilder: " + stringBuilder);

        // Without using Set
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()){
            if (!seen[ch]){
                seen[ch] = true;
                result.append(ch);
            }
        }
        System.out.println("After remove duplicate characters: " + result);


        // By using java 8
        String output = input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("After remove duplicate characters by using java8: " + output);
    }
}
