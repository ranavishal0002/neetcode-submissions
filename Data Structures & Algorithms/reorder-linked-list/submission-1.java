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
    public static ListNode reverseNodes(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head; 
        while(curr!=null)
        {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        // find the middle of the linked list so that we can reverse that

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverseNodes(slow);
        ListNode curr = head;
         while(rev.next!=null)
         {
            ListNode tempCurr = curr.next;
            curr.next = rev;

            ListNode tempRev = rev.next;
            rev.next = tempCurr;

            curr = tempCurr;
            rev= tempRev;
         }
    }
}
