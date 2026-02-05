// leetcode problem : https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

class five {
        public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int target = Math.abs(nums[i]) - 1;
            if(nums[target] < 0){
                ans.add(target + 1);
            }
            nums[target] = -nums[target];
        }
        return ans;
    }
}
