// leetcode problem : https://leetcode.com/problems/reorder-list/description/

// public class eight {
//         public void reorderList(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast.next != null && fast.next.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         ListNode second = slow.next;
//         slow.next = null;
//         ListNode prev = null;
//         while(second != null){
//             ListNode nextTemp = second.next;
//             second.next = prev;
//             prev = second;
//             second = nextTemp;
//         }
//         ListNode first = head;
//         second = prev;
//         while(second != null){
//             ListNode temp1 = first.next;
//             ListNode temp2 = second.next;
//             first.next = second;
//             second.next = temp1;
//             first = temp1;
//             second = temp2;
//         }
//     } 
// }


