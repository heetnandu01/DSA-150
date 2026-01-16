// Geeksforgeeks Problem : https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

class one {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int max = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }
}
