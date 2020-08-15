/**
 * 思路：递归判断左子树是否平衡，右子树是否平衡，在计算自己的高度。
 */
public class IsBalanceTree {
    public static class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int data) {
        this.value = data;
    }
}
public static class ReturnData
    {
        public boolean isB;
        public int h;
        public ReturnData(boolean isB,int h)
        {
            this.isB=isB;
            this.h=h;
        }
    }
public static boolean isbalanceTree(Node head)
{
return process(head).isB;
}
public static ReturnData process(Node head)
{
    if(head==null)
        return new ReturnData(true,0);
 if( !process(head.left).isB)//左子树不是平衡二叉树
     return new ReturnData(false,0);
 if(!process(head.right).isB)//右子树不是平衡二叉树
     return new ReturnData(false,0);
if(Math.abs(process(head.left).h-process(head.right).h)>1)
    return new ReturnData(false,0);
return new ReturnData(true,Math.max(process(head.left).h,process(head.right).h)+1);
}

}
