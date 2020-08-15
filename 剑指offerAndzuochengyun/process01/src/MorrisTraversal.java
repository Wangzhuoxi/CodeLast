public class MorrisTraversal {
    public static class Node {
        public int value;
        Node left;
        Node right;

        public Node(int data) {
            this.value = data;
        }
    }
    public  static void morrisPre(Node head)
    {
        if(head==null)
            return ;
       Node cur=head;
       Node mostRight=null;
       while(cur!=null)
       {
           mostRight=cur.left;
           if(mostRight!=null)
           {
               while(mostRight.right!=null&&mostRight.right!=cur)
               {
                   mostRight=mostRight.right;
               }
               if(mostRight.right==null)
               {
                   System.out.print(cur.value + " ");
                   mostRight.right=cur;
                   cur=cur.left;
                   continue;
               }
               if(mostRight.right==cur)
               {
                   mostRight.right=null;
               }

           }
           else {
           System.out.print(cur.value + " ");//没有左子树时，直接打印。
       }
           cur=cur.right;
       }
    }
    public  static void morrisIn(Node head)
    {
        if(head==null)
            return ;
        Node cur=head;
        Node mostRight=null;
        while(cur!=null)
        {
            mostRight=cur.left;
            if(mostRight!=null)
            {
                while(mostRight.right!=null&&mostRight.right!=cur)
                    mostRight=mostRight.right;
                if(mostRight.right==null)
                {
                    mostRight.right=cur;
                    cur=cur.left;
                    continue;
                }
                else
                {
                    mostRight.right=null;
                }
            }
            System.out.print(cur.value+" ");
            cur=cur.right;

        }
    }
    public  static void morrisPos(Node head)
    {
        if(head==null)
            return ;
        Node cur=head;
        Node mostRight=null;
        while(cur!=null)
        {
            mostRight=cur.left;
            if(mostRight!=null)
            {
                while(mostRight.right!=null&&mostRight.right!=cur)
                    mostRight=mostRight.right;
                if(mostRight.right==null)
                {
                    mostRight.right=cur;
                    cur=cur.left;
                    continue;
                }
                else
                {
                   printEdge(cur.left);
                    mostRight.right=null;
                }
            }
            System.out.print(cur.value+" ");
            cur=cur.right;
            printEdge(head);

        }
    }
    public static void printEdge(Node node)
    {
        Node tail= reverse(node);
        Node cur=tail;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.right;
        }
        reverse(tail);

    }
    public static Node reverse(Node from)
    {
        Node pre = null;
        Node next = null;
        while (from != null) {
            next = from.right;
            from.right = pre;
            pre = from;
            from = next;
        }
        return pre;
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.left = new Node(2);
        head.right = new Node(6);
        head.left.left = new Node(1);
        head.left.right = new Node(3);
        head.right.left = new Node(5);
        head.right.right = new Node(7);
        morrisPre(head);
        System.out.println("===============");
        morrisIn(head);


    }
}
