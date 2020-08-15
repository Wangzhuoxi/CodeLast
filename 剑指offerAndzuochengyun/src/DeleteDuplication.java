import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DeleteDuplication {
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
        ListNode p=pHead;
        ListNode first = new ListNode(-1);
        first.next = pHead;
        ListNode pre=first;
        while(p!=null&&p.next!=null)
        {
            if(p.val==p.next.val)
            {
                int val=p.val;
                p=p.next;
                while(p!=null&&p.val==val)
                {
                    p=p.next;
                }
                pre.next=p;

            }
            else
            {
                pre=p;
                p=p.next;

            }
        }
        return first.next;


    }
    }

