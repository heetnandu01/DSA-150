// leetcode problem : https://leetcode.com/problems/remove-k-digits/description/

import java.util.Stack;

class eight {
    class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(char digit:num.toCharArray()){
            while(k > 0 && !st.isEmpty() && st.peek() > digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) sb.append(ch);
        int i = 0;
        while(i<sb.length() && sb.charAt(i) == '0')i++;
        sb.delete(0,i);
        return sb.length() == 0 ? "0" : sb.toString();

    }
}
}
