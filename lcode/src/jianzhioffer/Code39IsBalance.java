package jianzhioffer;

public class Code39IsBalance {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int depth=0;

    /**
     * 求树的深度，如果树得左右深度相减>1 那么一定不对。并且自己的左右子树也必须满足一样的条件。
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution(TreeNode root) {
        TreeNode temp=root;
        if(temp==null)
            return true;

        if(Math.abs(TreeDepth(temp.left)-TreeDepth(temp.right))>1)
            return false;
        else
            return IsBalanced_Solution(temp.left)&&IsBalanced_Solution(temp.right);



    }
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        TreeNode temp = root;
        int left = 0;
        int right = 0;
        if (temp.left == null && temp.right == null)
            return 1;
        if (temp.left != null)
            left = TreeDepth(temp.left) + 1;
        if (temp.right != null)
            right = TreeDepth(temp.right) + 1;
        depth = Math.max(left, right);
        return depth;
    }
}
