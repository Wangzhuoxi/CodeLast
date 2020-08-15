public class SmallEqualBigger {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static Node split(Node head, int pivot) {
        if (head == null)
            return head;
        Node sh = null;//starthead
        Node st = null;//starttail
        Node eh = null;
        Node et = null;
        Node bh = null;
        Node bt = null;
        Node cur = head;
        Node next = head;
        while (cur != null) {
            next = cur.next;
            cur.next = null;
            if (cur.value < pivot) {
                if (sh == null) {
                    sh = cur;
                    st = cur;
                } else {
                    st.next = cur;
                    st = st.next;
                }
            } else if (cur.value == pivot) {
                if (eh == null) {
                    eh = cur;
                    et = cur;
                } else {
                    eh.next = cur;
                    et = et.next;
                }
            } else {

                if (bh == null) {
                    bh = cur;
                    bt = cur;
                } else {
                    bt.next = cur;
                    bt = bt.next;
                }
            }
            cur = next;
        }
        if(st!=null)
        {  st.next=eh;
        et=et==null?st:et;}
        if(et!=null)
        {
            et.next=bh;


        }
        return sh != null ? sh : eh != null ? eh : bh;
    }
    public static void printLinkedList(Node node) {
        System.out.print("Linked List: ");
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(9);
        head1.next.next = new Node(1);
        head1.next.next.next = new Node(8);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(2);
        head1.next.next.next.next.next.next = new Node(5);
        printLinkedList(head1);
        // head1 = listPartition1(head1, 4);
        head1 = split(head1, 5);
        printLinkedList(head1);

    }
}