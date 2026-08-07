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
    public void reorderList(ListNode head) {
        //Step 1: find middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next; // split into two half
        slow.next = null;  // actual seperation done here

        //Step 2: Reverse the Second Half

        ListNode prev = null;
        while(second!=null){
            ListNode nextNode = second.next;

            second.next = prev;
            prev = second;
            second = nextNode;
        }

        //Step 3: Merge both the Half
        ListNode first = head;
        second = prev;

        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next  = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
