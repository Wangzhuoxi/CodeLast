package jianzhioffer;
public class Code15ReverseList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

        public ListNode reverseList(ListNode head) {

            if (head == null)
                return null;
            ListNode cur = head;
            ListNode next = cur.next;
            ListNode pre = null;
            cur.next = pre;
            pre = cur;
            cur = next;
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;

            }
            return pre;

        }
}