public class IsSymmetrical {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
   public  boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)
            return true;
return isCommon(pRoot.left,pRoot.right);

    }
    public static boolean isCommon(TreeNode left,TreeNode right)
    {
        if(left==null&&right==null)
            return true;
        if(left!=null&&right!=null)
            return left.val==right.val&&isCommon(left.left,right.right)&&isCommon(left.right,right.left);
        else
            return false;
    }
}
