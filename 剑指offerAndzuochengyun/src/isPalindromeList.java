public class isPalindromeList {

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }
    //链表是否是回文链表
    public static boolean isPalindromelist(Node head)
    {
        boolean res=true;
        if(head==null||head.next==null)
            return true;
        Node fast=head;
        Node slow=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;//find mid
        }
        fast=slow.next;//fast的起始点
        slow.next=null;
        Node n3=null;//记录下一个节点
        while(fast!=null)//将右边的inverse
        {
            n3=fast.next;
            fast.next=slow;//slow是前节点
            slow=fast;
            fast=n3;
    }
Node temp1=slow;
        Node temp2=head;

while(temp1!=null&&temp2!=null)
{
    if(temp1.value!=temp2.value)
       {
           res=false;
           break;
       }
    else
    {
        temp1=temp1.next;
        temp2=temp2.next;
    }
}
//将旋转的链表再转回去
     n3=slow.next;//记录尾节点的下一个节点（此时是逆序的）
slow.next=null;//（结尾为null）
while(n3!=null)
{
    fast=n3.next;//记录下一个节点
n3.next=slow;//建立链接
slow=n3;
n3=fast;

}

return res;

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

        Node head = null;


        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println(isPalindromelist(head) + " | ");

        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        printLinkedList(head);
        System.out.println(isPalindromelist(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");


    }

}
