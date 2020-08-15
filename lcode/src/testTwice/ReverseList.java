package testTwice;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import javax.swing.*;

public class ReverseList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode pre=null;
        ListNode next=head.next;
        while(head!=null)
        {
            head.next=pre;
            pre=head;
            head=next;
            next=next.next;
        }
return pre.next;

    }
}
