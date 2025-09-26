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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode currentNode = dummy;
        dummy.next = head;

        while ((currentNode.next != null) && (currentNode.next.next != null)) {
            ListNode firstNode = currentNode.next;
            ListNode secondNode = firstNode.next;

            currentNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            currentNode = firstNode;
        } 

        return dummy.next;
        
    }
}
