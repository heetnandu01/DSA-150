// leetcode Problem : https://leetcode.com/problems/fruit-into-baskets/

import java.util.HashMap;

class four {
       public int totalFruit(int[] fruits) {
        int left = 0,maxlen = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int right = 0;right < fruits.length;right++){
            hash.put(fruits[right],hash.getOrDefault(fruits[right],0) + 1);

            while(hash.size() > 2){
                int leftfruit = fruits[left];
                hash.put(fruits[left],hash.get(fruits[left]) - 1);

                if(hash.get(fruits[left]) == 0){
                    hash.remove(fruits[left]);
                }
                left++;
            }

            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    } 
}
