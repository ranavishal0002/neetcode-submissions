/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1==null || head2==null)
        {
            return head1==null ? head2 : head1;
        }
        ListNode result;
        if(head1.val <= head2.val)
        {
            result = head1;
            result.next = mergeTwoLists(head1.next, head2);
        }else 
         {
            result = head2;
            result.next = mergeTwoLists(head1, head2.next);
         }
         return result;
    }
}