package testTwice;

public class GetDepth {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    int depth=0;
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return 1;
        int ldepth=0;
        if(root.left!=null) {
        ldepth= TreeDepth(root.left);
        }
        int rdepth=0;
        if(root.right!=null) {
            rdepth = TreeDepth(root.right);

        }
        return Math.max(rdepth,ldepth)+1;
        }


}