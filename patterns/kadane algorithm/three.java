// leetcode problem : https://leetcode.com/problems/maximum-product-subarray/description/

class three {
    public int maxProduct(int[] nums) {
        int maxsum = nums[0];
        int minsum = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = maxsum;
                maxsum = minsum;
                minsum = temp;
            }
            maxsum = Math.max(num, num * maxsum);
            minsum = Math.min(num, num * minsum);
            result = Math.max(result, maxsum);
        }
        return result;
    }
}
