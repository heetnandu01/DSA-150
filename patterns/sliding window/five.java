// leetcode problem : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashMap;

class five {
      public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlen = 0;
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int right = 0;right < s.length();right++){
            char ch = s.charAt(right);
            hash.put(ch,hash.getOrDefault(ch,0)+1);

            while(hash.get(ch) > 1){
                char leftchar = s.charAt(left);
                hash.put(leftchar,hash.get(leftchar) - 1);

                if(hash.get(leftchar) == 0){
                    hash.remove(leftchar);
                }
                left++;
            }
            maxlen = Math.max(maxlen,right - left + 1);
        }
        return maxlen;
    }
}