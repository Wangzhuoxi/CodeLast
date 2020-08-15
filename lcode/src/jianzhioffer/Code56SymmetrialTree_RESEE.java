package jianzhioffer;

public class Code56SymmetrialTree_RESEE {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        if (pRoot.left == null && pRoot.right == null)
            return true;
        return isCommon(pRoot.left, pRoot.right);
    }

    public boolean isCommon(TreeNode l, TreeNode r) {
        if (l == null && r == null)
            return true;
        else if (l != null && r != null)
            return l.val == r.val && isCommon(l.left, r.right) && isCommon(l.right, r.left);
        else
            return false;
    }
}
