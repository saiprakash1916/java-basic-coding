package interviewPoint;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    static void isAnagram(String str1, String str2) {
        String copyOfStr1 = str1.replaceAll("\\s+", "");
        String copyOfStr2 = str2.replaceAll("\\s+", "");
        boolean status;
        if (copyOfStr1.length() != copyOfStr2.length()) {
            status = false;
        } else {
            char[] strArray1 = copyOfStr1.toLowerCase().toCharArray();
            char[] strArray2 = copyOfStr2.toLowerCase().toCharArray();
            Arrays.sort(strArray1);
            Arrays.sort(strArray2);
            status = Arrays.equals(strArray1, strArray2);
        }
        if (status) System.out.println(str1 + " and " + str2 + " are anagrams");
        else System.out.println(str1 + " and " + str2 + " are not anagrams");
    }

    public static void main(String[] args) {

        // Taking the values from the user while run time
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first input to check Anagram or not?? ");
        String str1 = scanner.next();
        System.out.println("Enter the second input to check Anagram or not?? ");
        String str2 = scanner.next();
        isAnagram(str1, str2);

        // Pre-defined values to check
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("keEp", "peeK");
        isAnagram("SiLeNt CAT", "LisTen AcT");
        isAnagram("Debit Card", "Bad Credit");
        isAnagram("School MASTER", "The ClassROOM");
        isAnagram("DORMITORY", "Dirty Room");
        isAnagram("ASTRONOMERS", "NO MORE STARS");
        isAnagram("Toss", "Shot");
        isAnagram("joy", "enjoy");
    }
}
