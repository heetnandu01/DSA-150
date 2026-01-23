// leetcode problem : https://leetcode.com/problems/maximum-subarray/description/

class one {
        public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currentSum = 0;
        for(int num:nums){
            currentSum  += num;
            if(currentSum > maxsum){
                maxsum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxsum;
    } 
}
