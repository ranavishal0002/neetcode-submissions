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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node
        ListNode dummy = new ListNode(-1);

        // Tail pointer
        ListNode current = dummy;

        // Traverse both lists
        while(list1 != null && list2 != null){

            if(list1.val <= list2.val){

                current.next = list1;
                list1 = list1.next;
            }

            else{

                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Remaining nodes
        if(list1 != null){
            current.next = list1;
        }

        if(list2 != null){
            current.next = list2;
        }

        // Return merged list
        return dummy.next;
    }
}