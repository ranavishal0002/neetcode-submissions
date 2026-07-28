class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length =0;
        ListNode curr = head;
        while(curr !=null){
            length++;
            curr = curr.next;
        }
        if(n== length){
            return head.next;
        }
        int travel = length -n;
        curr = head;
        for(int i =1; i<travel; i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

}
        