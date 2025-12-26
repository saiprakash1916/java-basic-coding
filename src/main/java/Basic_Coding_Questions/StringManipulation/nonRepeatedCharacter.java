package Basic_Coding_Questions.StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Find the first non-repeated character in a string. */

public class nonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        input = input.toLowerCase().replaceAll("\\s+","");
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.println("First non-repeated character: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeated character found");
    }
}
