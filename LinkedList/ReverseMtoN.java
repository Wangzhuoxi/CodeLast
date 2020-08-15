package LinkedList;

public class ReverseMtoN {
    public Reverse1toN.ListNode reverseBetweenMtoN(Reverse1toN.ListNode head,int m,int n){
        if(m==1) {
            reverseNth(head, n);
        }
            else{
             head.next=  reverseBetweenMtoN(head.next,m+1,n-1);
            }
        return head;
    }

    private Reverse1toN.ListNode reverseNth(Reverse1toN.ListNode head,int n) {
        //记录第n+1个节点
        Reverse1toN.ListNode succussor=null;
        if(n==1)
        {
            succussor=head.next;
            return head;
        }
        else
        {
            Reverse1toN.ListNode last=reverseNth(head.next,n-1);
            head.next.next=head;
            head.next=succussor;
            return last;
        }
    }
}
