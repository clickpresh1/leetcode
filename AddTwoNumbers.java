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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        int l1Val = 0;
        int l2Val = 0;
        int rem = 0;
        ListNode l3Dummy = new ListNode(-1);
        ListNode l3 = l3Dummy;
        while ((l1 != null) || (l2 != null) || (carry != 0)) {
            if (l1 != null) {
                l1Val = l1.val;
            } else {
                l1Val = 0;
            } 

            if (l2 != null) {
                l2Val = l2.val;
            } else {
                l2Val = 0;
            }

            sum = l1Val + l2Val + carry;
            carry = sum / 10;
            rem = sum % 10;

            l3.next = new ListNode(rem);
            l3 = l3.next;

            if (l1 != null) {
                l1 = l1.next;
            } 
            if (l2 != null) {
                l2 = l2.next;
            }
            
        } 
        

        return l3Dummy.next;
    }
}
