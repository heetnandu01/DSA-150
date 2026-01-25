// leetcode problem : https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion/description/

class four {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int prevwithdel = 0;
        int prevnotdel = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            prevwithdel = Math.max(prevnotdel, prevwithdel + arr[i]);
            prevnotdel = Math.max(prevnotdel + arr[i], arr[i]);
            max = Math.max(max, Math.max(prevwithdel, prevnotdel));
        }
        return max;
    }
}
