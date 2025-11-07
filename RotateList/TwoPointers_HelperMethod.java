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

        int l = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            l += 1;
        } 

        if (l == 1) return head;

        k %= l;

        if (k == 0) return head;

        ListNode lead = head;
        for (int i = 0; i < k; i++) {
            lead = rotate(lead);
        } 

        return lead;
    } 

    public static ListNode rotate(ListNode head) {
        ListNode curr = head;
        int l = 1;
        while (curr.next != null) {
            curr = curr.next;
            l += 1;
        } 

        curr.next = head;

        ListNode temp = head;
        for (int i = 0; i < l - 2; i++) {
            temp = temp.next;
        } 

        ListNode lead = temp.next;
        temp.next = null;

        return lead;
    }
}
