// leetcode problem : https://leetcode.com/problems/reverse-linked-list-ii/description/

// class two {
//      public ListNode reverseBetween(ListNode head, int left, int right) {
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode prev = dummy;
//         for(int i = 1;i<left;i++){
//             prev = prev.next;
//         }
//         ListNode curr = prev.next;
//         for(int i = 0;i<right-left;i++){
//             ListNode nextemp = curr.next;
//             curr.next = nextemp.next;
//             nextemp.next = prev.next;
//             prev.next = nextemp;
//         }
//         return dummy.next;
//     }
// }
