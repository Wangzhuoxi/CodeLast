public class KNode {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public int count=0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {

      KthNode(pRoot.left,k);
      if(pRoot==null)
        return null;
        count++;
        if(count==k)
            return pRoot;
        KthNode(pRoot.right,k);


    }
}
