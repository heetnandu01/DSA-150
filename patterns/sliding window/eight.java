//leetcode Problem: https://leetcode.com/problems/permutation-in-string/

import java.util.HashMap;

class eight {
     public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        int left = 0;
        int count = hash.size();
        for(int right = 0;right < s2.length();right++){
            char ch = s2.charAt(right);
            if(hash.containsKey(ch)){
                hash.put(ch,hash.get(ch)-1);
                if(hash.get(ch) == 0){
                    count--;
                }
            }
            while(right - left + 1 > s1.length()){
                char leftchar = s2.charAt(left);
                if(hash.containsKey(leftchar)){
                    if(hash.get(leftchar) == 0){
                        count++;
                    }
                    hash.put(leftchar,hash.get(leftchar)+1);
                }
                left++;
            }
            if(count == 0){
                return true;
            }
        }
        return false;
    }
}
