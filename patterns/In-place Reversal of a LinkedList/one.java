// leetcode problem: https://leetcode.com/problems/reverse-linked-list/description/

// class one {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         while (curr != null) {
//             ListNode nexttemp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nexttemp;
//         }
//         return prev;
//     }
// }
