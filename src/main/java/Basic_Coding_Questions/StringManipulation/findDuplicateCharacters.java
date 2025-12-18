package Basic_Coding_Questions.StringManipulation;

import java.util.*;

/* Find duplicate characters in a string. */

public class findDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        input = input.toLowerCase().replaceAll("\\s+", "");
        Map<Character, Integer> map = new HashMap<>();

        /*
        One approach
        for (char ch : input.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        */

        // Another approach
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Duplicate characters are: ");
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
