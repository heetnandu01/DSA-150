// leetcode Problem : https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

class two {
        public boolean isValid(String s) {
        Stack<Character> blue = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
                if(ch == '(' || ch == '{' || ch == '['){
                    blue.push(ch);
                }else{
                    if(blue.isEmpty()) return false;
                    char red = blue.peek();
                    if((ch == ')' && red == '(') 
                    || (ch == '}' && red== '{')
                    ||(ch == ']' && red == '[')){
                        blue.pop();
                    }else{
                        return false;
                    }
                }
            }
        return blue.isEmpty();
    }
}