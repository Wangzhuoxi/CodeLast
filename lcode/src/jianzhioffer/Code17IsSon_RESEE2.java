package jianzhioffer;

public class Code17IsSon_RESEE2 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null)
            return false;
        return check(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);

    }
    public boolean check(TreeNode r1,TreeNode r2)
    {
        if(r1==null&&r2==null)
            return true;
        if(r1==null&&r2!=null)
            return false;
        if(r2==null&&r1!=null)
            return true;
        return r1.val==r2.val&&check(r1.left,r2.left)&&check(r1.right,r2.right);
    }
}
