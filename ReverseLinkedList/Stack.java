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
    public ListNode reverseList(ListNode head) {
        if ((head == null) || (head.next == null)) return head;

        Stack<ListNode> stack = new Stack<>();

        ListNode curr = head;

        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        } 

        ListNode node = stack.pop();
        ListNode help = node;

        while (!(stack.isEmpty())) {
            ListNode temp = stack.pop();
            help.next = temp;
            help = help.next;
        }

        help.next = null;
        
        return node;
    }
}
