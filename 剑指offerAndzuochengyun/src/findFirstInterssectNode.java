public class findFirstInterssectNode {
    /**
     * 首先判断链表是有环还是无环
     * 判断无环链表第一个相交的节点   必须end1==end2否则不可能相交
     * 有环链表三种情况 不相交 同一点入环  不同点入环
     */

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }
    public static Node findIntersectNode(Node head1,Node head2)
    {
        if(head1==null||head2==null)
            return null;
        Node loop1=getLoopNode(head1);

           Node loop2=getLoopNode(head2);

        if(loop1==null&&loop2==null)
        {
            return noLoop(head1,head2);//计算无环链表的相交节点
        }
         if(loop1!=null&&loop2!=null)
                return loop(head1,loop1,head2,loop2);

        return null;
    }
   public static Node getLoopNode(Node head)
    {
        if (head == null || head.next == null || head.next.next == null) {
        return null;
    }

        Node slow = head.next; // n1 -> slow
        Node fast = head.next.next; // n2 -> fast
        while (slow != fast) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        fast=head;
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    public static Node noLoop(Node head1,Node head2)
    {
        int len1=0;
        Node cur1=head1;
        Node cur2=head2;
        while(cur1.next!=null)
        {
            len1++;
            cur1=cur1.next;
        }
        while(cur2.next!=null)
        {
            len1--;
            cur2=cur2.next;
        }
        if(cur1!=cur2)
            return null;
       cur1=len1>0?head1:head2;
       cur2=cur1==head1?head2:head1;
       len1=Math.abs(len1);

           while(len1>0) {
               cur1 = cur1.next;
               len1--;
           }
        while(cur1!=cur2)
        {

            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
    public static Node loop(Node head1,Node loop1,Node head2,Node loop2)
    {
        if(loop1==loop2)
        {
            int len1=0;
            Node cur1=head1;
            Node cur2=head2;
            while(cur1!=loop1)
            {
                len1++;
                cur1=cur1.next;
            }
            while(cur2!=loop2)
            {
                len1--;
                cur2=cur2.next;
            }
            cur1=len1>0?head1:head2;
            cur2=cur1==head1?head2:head1;
            len1=Math.abs(len1);

            while(len1>0) {
                cur1 = cur1.next;
                len1--;
            }
            while(cur1!=cur2)
            {

                cur1=cur1.next;
                cur2=cur2.next;
            }
            return cur1;
        }
        else
        {
            Node cur1=loop1.next;
            while(cur1!=loop1)
            {
                if(cur1==loop2)
                    return loop1;
                cur1=cur1.next;
            }
            return null;
        }


    }
    public static void main(String[] args) {
        // 1->2->3->4->5->6->7->null
  /*      Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);

        // 0->9->8->6->7->null
        Node head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(findIntersectNode(head1, head2).value);
*/
        // 1->2->3->4->5->6->7->4...
      Node  head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next = head1.next.next.next; // 7->4

        // 0->9->8->2...
       Node head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next; // 8->2
        System.out.println(findIntersectNode(head1, head2).value);

        // 0->9->8->6->4->5->6..
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(findIntersectNode(head1, head2).value);

    }
}
