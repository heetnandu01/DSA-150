// leetcode problem : https://leetcode.com/problems/contiguous-array/description/

import java.util.HashMap;

class four {
      public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,-1);
        int sum = 0;
        int maxlen = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                sum = sum + 1;
            }else{
                sum = sum - 1;
            }
            if(hash.containsKey(sum)){
                maxlen = Math.max(maxlen,i - hash.get(sum));
            }else{
                hash.put(sum,i);
            }
        }
        return maxlen;
    }
}
