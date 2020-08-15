package jianzhioffer;

import javax.xml.bind.Marshaller;

public class Code36FindFirstNode {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            ListNode p1=pHead1;
            ListNode p2=pHead2;
            int n1=0;
            int n2=0;
            int n=0;
            while(p1!=null)
            {
                n1++;
                p1=p1.next;
            }
            while(p2!=null)
            {
                p2=p2.next;
                n2++;
            }
            n=n1>n2?n1-n2:n2-n1;

            p1=n==n1-n2?p1:p2;
            p2=n==n1-n2?p2:p1;
            while(n>0)
            {
                p1=p1.next;
            }
            while(p1!=null&&p2!=null)
            {
                if(p1==p2)
                    return p1;
                p1=p1.next;
                p2=p2.next;
            }
            return null;

        }

}
