// leetcode Problem : https://leetcode.com/problems/first-unique-character-in-a-string/

// public class one {
//     public int firstUniqChar(String s) {
//         HashMap<Character, Integer> hash = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             hash.put(ch, hash.getOrDefault(ch, 0) + 1);
//         }

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (hash.get(ch) == 1) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
