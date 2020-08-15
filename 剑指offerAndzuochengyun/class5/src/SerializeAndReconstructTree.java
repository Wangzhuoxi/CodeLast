import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndReconstructTree {
    /**
     * 序列化和反序列化：序列化是根据树生成字符串，反序列化根据字符串分割为String数组，重建成树。
     */
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public SuccessorNode.Node parent;

        public Node(int data) {
            this.value = data;
        }
    }
    public static String SerializeByPre(Node head)
    {
        if(head==null)
            return "#_";
  String res=head.value+"_";
  res+=SerializeByPre(head.left);
  res+=SerializeByPre(head.right);
  return res;

}
public static Node Reconstrutor(String res)
{
    String[] values=res.split("_");
    Queue<String> queue=new LinkedList<>();
    for(int i=0;i<values.length;i++)
    {
        queue.add(values[i]);
    }
    return reconstructTree(queue);
}
public static Node reconstructTree(Queue<String> queue)
{
    String temp=queue.poll();
    if(temp.equals("#"))
        return null;
    Node head=new Node(Integer.valueOf(temp));
    head.left=reconstructTree(queue);
    head.right=reconstructTree(queue);
return head;

}
public static void printTree(Node head)
{
    System.out.println("Binary Tree:");
    printInOrder(head, 0, "H", 17);
    System.out.println();
}

    public static void printInOrder(Node head, int height, String to, int len) {
        if (head == null) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.value + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }

    public static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }

    public static void main(String[] args) {
        Node head = null;
        printTree(head);

        String pre = SerializeByPre(head);
        System.out.println("serialize tree by pre-order: " + pre);
        head = Reconstrutor(pre);
        System.out.print("reconstruct tree by pre-order, ");
        printTree(head);


        System.out.println("====================================");
        head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.right.right = new Node(5);
        printTree(head);

        pre = SerializeByPre(head);
        System.out.println("serialize tree by pre-order: " + pre);
        head = Reconstrutor(pre);
        System.out.print("reconstruct tree by pre-order, ");
        printTree(head);


       /* level = serialByLevel(head);
        System.out.println("serialize tree by level: " + level);
        head = reconByLevelString(level);
        System.out.print("reconstruct tree by level, ");
        printTree(head);
*/
        System.out.println("====================================");

    }
}
