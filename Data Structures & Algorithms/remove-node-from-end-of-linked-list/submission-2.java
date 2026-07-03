class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode curr = head;
        while(curr!=null)
        {
            length++;
            curr = curr.next;
        }
         if (n == length)
        {
            return head.next;
        }
        
        ListNode temp = head;
        int travel = length -n;

        for(int i = 1; i<travel; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}