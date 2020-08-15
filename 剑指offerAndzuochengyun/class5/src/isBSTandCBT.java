import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 搜索二叉树左孩子一定比节点小，右孩子比节点大，即中序遍历的话是递增的。
 */
public class isBSTandCBT {
    public static class Node
    {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }
    public static boolean isBST(Node head)
    {

        Node last=null;
        if(head!=null)
        {
            Stack<Node> stack=new Stack<>();
            while(head!=null||!stack.isEmpty())

            {
                if(head!=null)
                {
                    stack.push(head);
                    head=head.left;
                }
                else
                {
                  if(last==null)
                      last=stack.pop();
                  else {
                      if (stack.peek().value < last.value)
                          return false;
                      else
                      {
                          last=stack.peek();
                          head=stack.pop().right;
                      }
                  }
                }
            }
        }
        return true;
    }

    /**
     * 完全二叉树判断几种情况:1.左子树为空，右子树不为空。2.为叶节点之后后面的必须是叶节点。
     * @param head
     * @return
     */
    public static boolean isCBT(Node head)
    {
         Boolean leaf=false;
        Queue<Node> queue=new LinkedList<>();
        queue.add(head);
        if(queue!=null)
        {
            Node temp=queue.poll();
             Node l=temp.left;
             Node r=temp.right;
             if((leaf&&(l!=null||r!=null)||(l==null&&r!=null)))
                 return false;
            if(l==null&&r==null)
                     leaf=true;
             if(l!=null)
                 queue.add(l);
             if(r!=null)
                 queue.add(r);
        }
        return true;

    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.left = new Node(2);
        head.right = new Node(6);
        head.left.left = new Node(1);
        head.left.right = new Node(3);
        head.right.left = new Node(5);


      //  System.out.println(isBST(head));
        System.out.println(isCBT(head));

    }
}
