package LinkedList;

/**
 * 反转链表的前n个数
 * 延申：反转链表的m到n
 * 解法:用递归,宏观的看
 */
public class Reverse1toN {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseNth(ListNode head,int n){
        //记录第n+1个节点
        ListNode succussor=null;
        if(n==1)
            {
                succussor=head.next;
                return head;
            }
        else
        {
            ListNode last=reverseNth(head.next,n-1);
            head.next.next=head;
            head.next=succussor;
            return last;
        }
    }
}
