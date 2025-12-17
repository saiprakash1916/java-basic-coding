package Basic_Coding_Questions.StringManipulation;

import java.util.Arrays;

public class stringAnagrams {
    static void isAnagram(String str1, String str2) {
        String copyOfStr1 = str1.toLowerCase().replaceAll("\\s+", "");
        String copyOfStr2 = str2.toLowerCase().replaceAll("\\s+", "");
        boolean status;
        if (copyOfStr1.length() != copyOfStr2.length()) {
            status = false;
        } else {
            char[] strCharArray1 = copyOfStr1.toCharArray();
            char[] strCharArray2 = copyOfStr2.toCharArray();
            Arrays.sort(strCharArray1);
            Arrays.sort(strCharArray2);
            status = Arrays.equals(strCharArray1, strCharArray2);
        }
        if (status) System.out.println(str1 + "and" + str2 + "are anagrams");
        else System.out.println(str1 + "and" + str2 + "are not anagrams");
    }

    public static void main(String[] args) {
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
