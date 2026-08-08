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

        int totalLen =0;

        ListNode curr = head;
        while(curr!= null){
            totalLen++;
            curr= curr.next;
        }

        if(n==totalLen){
            return head.next;
        }
        int travel = totalLen-n;
       ListNode temp = head;
        for(int i=1; i<travel; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
