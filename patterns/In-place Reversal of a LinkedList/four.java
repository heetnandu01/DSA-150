// leetcode Problem : https://leetcode.com/problems/rotate-list/description/

// class four {
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head == null || k == 0) return head;
//         int len = 1;
//         ListNode tail = head;
//         while(tail.next != null){
//             tail = tail.next;
//             len++;
//         }
//         tail.next = head;
//         k = k % len;
//         ListNode current = head;
//         for(int i = 0;i<len-k-1;i++){
//             current= current.next;
//         }
//         ListNode newWave = current.next;
//         current.next = null;
//         return newWave;
//     }
// }