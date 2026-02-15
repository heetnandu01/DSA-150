// leetcode Problem : https://leetcode.com/problems/next-greater-element-ii/description/

import java.util.Arrays;
import java.util.Stack;

class three {
     public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<2*n;i++){
            int index = i % n;
            while(!st.isEmpty() && nums[index] > nums[st.peek()]){
                result[st.pop()] = nums[index];
            }

            if(i<n){
                st.push(i);
            }
        }
        return result;
    }
}
