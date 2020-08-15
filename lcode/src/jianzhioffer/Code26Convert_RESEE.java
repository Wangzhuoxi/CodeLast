package jianzhioffer;

public class Code26Convert_RESEE {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
TreeNode head=null;
    TreeNode pre=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        convert(pRootOfTree);
         return head;
    }
    public void convert(TreeNode tree)
    {
        if(tree==null)
            return;
        convert(tree.left);
        if(head==null)
            head=tree;
        if(pre!=null) {
            pre.right = tree;
            tree.left=pre;
        }
        pre=tree;
        convert(tree.right);
    }
}
