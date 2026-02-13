// leetcode problem: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

// class one {
//       public String removeDuplicates(String s) {
//         Stack<Character> hr = new Stack<>();
//         for(char ch : s.toCharArray()){
//             if(hr.isEmpty()){
//                 hr.push(ch);
//             }else if(hr.peek() == ch){
//                 hr.pop();
//             }else{
//                 hr.push(ch);
//             }
//         }
//         StringBuilder result = new StringBuilder();
//         for (char c : hr) {
//             result.append(c);
//         }
//         return result.toString();
//     }
// }   
