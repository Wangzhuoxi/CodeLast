package jianzhioffer;

/**
 * 搜索二叉树：就是中序遍历的第k个数。
 */
public class Code60TheKthNode {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    int count=0;
    TreeNode ans=null;

    TreeNode KthNode(TreeNode pRoot, int k){
        helper(pRoot, k);
        return ans;
    }

    public void helper(TreeNode node, int k){
        if (node==null || count>k) {
            return;
        }
        helper(node.left, k);
        count++;
        if (count == k) {
            ans = node;
        }
        helper(node.right, k);


    }
}