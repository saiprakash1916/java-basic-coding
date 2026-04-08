package interviewPoint;

import java.util.Arrays;

public class MergeTwoArrays {
    static int[] nonSortedArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];
        int index = 0;
        for(int i = 0; i < n; i ++){
            merged[index++] = arr1[i];
        }
        for(int i = 0; i < m; i ++){
            merged[index++] = arr2[i];
        }
        return merged;
    }

    static int[] sortedArray(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m){
            if(arr1[i] <= arr2[j]){
                merged[k++] = arr1[i++];
            }else{
                merged[k++] = arr2[j++];
            }
        }

        while (i < n){
            merged[k++] = arr1[i++];
        }
        while (j < m){
            merged[k++] = arr2[j++];
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 9, 4};
        int[] arr2 = {10, 1, 50, 8, 100};

        System.out.println(Arrays.toString(nonSortedArray(arr1, arr2)));
        System.out.println(Arrays.toString(sortedArray(arr1, arr2)));
    }
}
