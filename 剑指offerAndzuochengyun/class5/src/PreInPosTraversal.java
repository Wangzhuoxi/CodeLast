import netscape.security.UserTarget;

import java.util.Stack;

public class PreInPosTraversal {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }
    public void preOrderRecur(Node head)
    {
        if(head==null)
            return;
        if(head!=null)
            System.out.println(head.value);
        preOrderRecur(head.left);
        preOrderRecur(head.right);

    }
    public void preOrderUnRecur(Node head)
    {

        if (head != null) {
            //add返回值boolean push返回值void
            Stack<Node> nodes=new Stack<>();
            nodes.add(head);
            System.out.println(nodes.pop().value);
            while(!nodes.isEmpty()) {
                if (head.right != null)
                    nodes.push(head.right);
                if (head.left != null)
                    nodes.push(head.left);
            }
        }
    }

    public void inOrderRecur(Node head)
    {
        if(head==null)
            return;
        preOrderRecur(head.left);
        System.out.println(head.value);
        preOrderRecur(head.right);
    }
    public void inOrderUnRecur(Node head)
    {
        if (head != null)
        {

            Stack<Node> temp = new Stack<>();
            while(!temp.isEmpty()||head!=null) {
                if(head!=null)
                {
                    temp.push(head);
                    head=head.left;
                }
                else
                {
                head=temp.pop();
                    System.out.println(head.value);
                head=head.right;
                }
            }

            }

    }
    public void posOrderRecur(Node head)
    {
        if(head==null)
            return ;
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println(head.value);
    }

    public void posOrderUnrecur(Node head)
    {

            Stack<Node> temp=new Stack<>();
            Stack<Node> stack=new Stack<>();
        if(head!=null)
        {
            temp.add(head);
            while(!temp.isEmpty())
            {
              head=  temp.pop();
               stack.push(head);
               if(head.left!=null)
                   temp.add(head.left);
               if(head.right!=null)
                   temp.add(head.right);
             }
            }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop().value+" ");
        }
        }
    }


