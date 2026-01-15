// leetcode Problem : https://leetcode.com/problems/longest-palindrome/

import java.util.HashMap;

class three {
        public int longestPalindrome(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int count = 0;
        boolean odd = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        for (int freq : hash.values()) {
            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1;
                odd = true;
            }
        }
        if (odd) {
            count += 1;
        }

        return count;
    }
}
