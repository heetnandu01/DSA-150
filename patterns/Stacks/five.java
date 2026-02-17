//leetcode problem : https://leetcode.com/problems/remove-nodes-from-linked-list/description/

// import java.util.Stack;

// class five {
//        public ListNode removeNodes(ListNode head) {
//         ListNode curr = head;
//         Stack<ListNode> st = new Stack<>();
//         while(curr != null){
//             while(!st.isEmpty() && st.peek().val < curr.val){
//                 st.pop();
//             }
//             st.push(curr);
//             curr = curr.next;
//         }
//         ListNode next = null;
//         while(!st.isEmpty()){
//             curr = st.pop();
//             curr.next = next;
//             next = curr;
//         }
//         return curr;
//     }
// }
