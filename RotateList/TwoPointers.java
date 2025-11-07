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
    public ListNode rotateRight(ListNode head, int k) {
        if ((head == null) || (k == 0)) return head;

        ListNode curr = head;
        int l = 1;
        while (curr.next != null) {
            curr = curr.next;
            l += 1;
        } 

        if (l == 1) return head;

        curr.next = head;

        k %= l;

        ListNode temp = head;
        for (int i = 0; i < (l - k - 1); i++) {
            temp = temp.next;
        } 

        ListNode lead = temp.next;
        temp.next = null;

        return lead;
    }
}
