package Basic_Coding_Questions.ArraysAndCollections;

/* Remove duplicate elements from an array. */

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 2, 4, 6, 8, 9, 10, 33, 55, 33, 99};
        System.out.print("Original Array: ");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.print("\n Print only Duplicated elements: ");
        for (int i = 0; i < numbers.length; i ++){
            for (int j = i + 1; j < numbers.length; j ++){
                if (numbers[i] == numbers[j]){
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }

        Set<Integer> uniqueSet = new LinkedHashSet<>();
        Set<Integer> duplicateSet = new LinkedHashSet<>();
        for (int num : numbers){
            if (!uniqueSet.add(num)){
                duplicateSet.add(num);
            }
        }

        System.out.print("\n Print Duplicate Elements by using HashSet: ");
        for (int num : duplicateSet){
            System.out.print(num + " ");
        }

        System.out.print("\n After removing Duplicates: ");
        for (int num : uniqueSet){
            System.out.print(num + " ");
        }
    }
}
