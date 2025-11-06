/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode delay = dummy;
        ListNode curr = head;

        int i = 0;
        while (curr != null) {
            if (i < n) {
                i += 1;
            } else {
                delay = delay.next;
            } 

            curr = curr.next;
        } 

        delay.next = delay.next.next;

        return dummy.next;
    }
}
