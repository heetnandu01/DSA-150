// leetcode problem : https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/description/

class five {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum = nums[0];
        int minsum = Integer.MAX_VALUE;
        int currentsum = 0;
        for (int num : nums) {
            currentsum += num;
            if (currentsum > maxsum) {
                maxsum = currentsum;
            }
            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        currentsum = 0;
        for (int num : nums) {
            currentsum += num;
            minsum = Math.min(minsum, currentsum);
            if (currentsum > 0) {
                currentsum = 0;
            }
        }
        int result = Math.max(Math.abs(maxsum), Math.abs(minsum));
        return result;
    }
}
