package jianzhioffer;

public class Code14LastKthNode {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

        public ListNode FindKthToTail(ListNode head,int k) {
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<k;i++)
            fast=fast.next;
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
        }


}
