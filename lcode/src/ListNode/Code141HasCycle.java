package ListNode;

public class Code141HasCycle {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)
            return false;
        ListNode fast = head.next;
        ListNode slow=head;
        while(fast!=slow)
        {
            if(fast.next==null||fast.next.next==null)
                return false;
            fast=fast.next.next;
            slow=slow.next;
        }
        return true;

    }
}
