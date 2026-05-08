package Core_Problems;

import java.util.Arrays;
import java.util.HashMap;

/*
        Given an integer array nums and an integer target,
        return the indices of the two numbers such that they add up to the target.
 */

public class Two_SumOfIntegers {
    static int[] twoSum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    static int[] twoSumUsingHashMap(int[] num, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int complement = target - num[i];
            if (map.containsKey((complement))) {
                return new int[]{map.get(complement), i};
            }
            map.put(num[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(twoSum(num, target)));
        System.out.println(Arrays.toString(twoSumUsingHashMap(num, target)));
    }
}
