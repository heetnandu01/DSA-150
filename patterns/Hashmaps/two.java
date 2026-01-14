// leetcode problem : https://leetcode.com/problems/maximum-number-of-balloons/

import java.util.HashMap;

class two {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        int b = hash.getOrDefault('b', 0);
        int a = hash.getOrDefault('a', 0);
        int l = hash.getOrDefault('l', 0) / 2;
        int o = hash.getOrDefault('o', 0) / 2;
        int n = hash.getOrDefault('n', 0);

        return Math.min(Math.min(b, a), Math.min(Math.min(l, o), n));

    }
}
