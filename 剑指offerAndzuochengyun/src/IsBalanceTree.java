import sun.reflect.generics.tree.Tree;

public class IsBalanceTree {
    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.value = data;
        }
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1)
            return false;
        else
            return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);

    }
    public static int getHeight(TreeNode node)
    {
        if(node==null)
            return 0;
        if(node.left==null&&node.right==null)
            return 1;
        return Math.max(getHeight(node.left),getHeight(node.right))+1;
    }
}
