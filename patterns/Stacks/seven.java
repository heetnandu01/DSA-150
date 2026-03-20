// leetcode Problem :https://leetcode.com/problems/simplify-path/description/

import java.util.Stack;

class PStacksSeven {
     public String simplifyPath(String path) {
        Stack<String> red = new Stack<>();
        String[] blues = path.split("/");
        for(String blue:blues){
            if(blue.equals("") || blue.equals(".")){
                continue;
            }
            if(blue.equals("..")){
                if(!red.isEmpty()){
                    red.pop();
                }
            }else{
                red.push(blue);
            }
        }
        if(red.isEmpty()){
            return "/";
        }
        StringBuilder res = new StringBuilder();
        for(String dir:red){
            res.append("/").append(dir);
        }
        return res.toString();
    }
}