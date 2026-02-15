// leetcode problem : https://leetcode.com/problems/daily-temperatures/description/

import java.util.Stack;

class four {
      public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                result[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        return result;
    }
}
