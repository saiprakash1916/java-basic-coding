package Basic_Coding_Questions.StringManipulation;

/* Find the number of vowels and consonants in a string. */

import java.util.*;
import java.util.stream.Collectors;

public class numberOfVowelsConsonantsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String to find Vowels Consonants: ");
        String input = scanner.nextLine();

        // Normal Approach
        int vowels = 0, consonants = 0;
        input = input.toLowerCase().replaceAll("\\s", "");
        for (char ch : input.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }

        // By using java 8
        Map<String, Long> countMap = input.chars()
                .map(Character::toLowerCase)
                .filter(c -> c >= 'a' && c <= 'z')
                .boxed()
                .collect(Collectors.groupingBy(
                        c -> "aeiou".indexOf(c) != -1 ? "vowel" : "consonant",
                        Collectors.counting()
                ));

        System.out.println("Vowels is: " + vowels + " and Consonants is: " + consonants);
        System.out.println(countMap);
    }
}
