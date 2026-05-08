package interviewPoint;

import java.util.Scanner;

public class reverseString {
    static String stringReverse(String input){
        char[] ch = input.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(stringReverse(input));
    }
}
