// leetcode problem : https://leetcode.com/problems/longest-repeating-character-replacement/

import java.util.HashMap;

class six {
    public int characterReplacement(String s, int k) {
        int left = 0, maxlen = -1;
        int maxfreq = 0;
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
            maxfreq = Math.max(maxfreq, hash.get(ch));

            while ((right - left + 1) - maxfreq > k) {
                char leftchar = s.charAt(left);
                hash.put(leftchar, hash.get(leftchar) - 1);
                if (hash.get(ch) == 0) {
                    hash.remove(leftchar);
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}
