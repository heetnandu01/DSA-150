// leetcode problem : https://leetcode.com/problems/max-consecutive-ones-iii/

import java.util.HashMap;

class seven {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxlen = 0;
        int zerocount = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            hash.put(nums[right], hash.getOrDefault(nums[right], 0) + 1);
            if (nums[right] == 0)
                zerocount++;

            while (zerocount > k) {
                int leftchar = nums[left];
                hash.put(nums[left], hash.get(nums[left]) - 1);
                if (nums[left] == 0)
                    zerocount--;
                if (hash.get(nums[left]) == 0) {
                    hash.remove(leftchar);
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}
