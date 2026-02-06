// leetcode problem:https://leetcode.com/problems/minimum-removals-to-balance-array/description/

import java.util.Arrays;

class nine {
        public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int maxlen = 0;
        for(int right = 0;right < n;right++){
            while(nums[right] > (long) nums[left] * k){
                left++;
            }
            maxlen = Math.max(maxlen , right - left + 1);
        }
        return n - maxlen;
    }
}
