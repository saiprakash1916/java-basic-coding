package Core_Problems;

public class rangeSum {
    static int[] prefixRangeSum(int[] arr, int[][] range) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        int[] result = new int[range.length];
        for (int i = 0; i < range.length; i++) {
            int L = range[i][0];
            int R = range[i][1];
            if (L == 0) result[i] = prefixSum[R];
            else result[i] = prefixSum[R] - prefixSum[L - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[][] range = {{1, 3}, {4, 8}, {2, 7}};
        int[] result = prefixRangeSum(arr, range);
        for (int value : result) {
            System.out.println(value);
        }
    }
}
