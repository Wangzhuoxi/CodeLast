package jianzhioffer;

public class Code54DeleteMorethanOne_RESEE {

 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


        public ListNode deleteDuplication(ListNode pHead)
        {
            if(pHead==null)
                return null;
            ListNode start=new ListNode(-1);
            start.next=pHead;
            ListNode pre=start;
            ListNode p=pHead;
            int val=0;
            while(p!=null&&p.next!=null)
            {
                if(p.val==p.next.val) {
                    val = p.val;
                    p=p.next;
                    while(p!=null&&p.val==val)
                        p=p.next;
                    pre.next=p;
                }
                else
                {
                    pre=pre.next;
                    p=p.next;
                }
            }
            return start.next;
        }
    }

