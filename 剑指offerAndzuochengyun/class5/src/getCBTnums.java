public class getCBTnums {
    /**
     * 若设二叉树的深度为k，除第 k 层外，其它各层 (1～k-1) 的结点数都达到最大个数，第k 层所有的结点都连续集中在最左边，这就是完全二叉树。
     */
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }
    public static int getNums(Node head) {
        return getNodesNums(head,1,getHeight(head,1));
    }
    public static int getNodesNums(Node node,int level, int h)
    {
        if(level==h)
            return 1;
        if(getHeight(node.right,level+1)==h)
            return getNodesNums(node.right,level+1,h)+(1<<(h-level));
        else
            return getNodesNums(node.left,level+1,h)+(1<<(h-level-1));
    }
   public static int  getHeight(Node node,int level)
   {
       while(node!=null)
       {
           level++;
           node=node.left;
       }
       level--;
       return level;
   }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        System.out.println(getNums(head));

    }
}
