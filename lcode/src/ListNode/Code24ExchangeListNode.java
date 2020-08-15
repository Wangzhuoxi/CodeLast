package ListNode;

/**
 * 递归三步：
 * 1.确定终止条件。
 * 2.确定返回值（返回给上一级什么）
 * 3.只看本级做了什么？
 */
public class Code24ExchangeListNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        //返回的是交换后的链表
        ListNode next=head.next;
        head.next=swapPairs(next.next);
        next.next=head;
        return next;

    }
}
