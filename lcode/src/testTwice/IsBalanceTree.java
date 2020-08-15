package testTwice;

public class IsBalanceTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

        /**
         * 所有的子树都必须为平衡二叉树
         *
         * @param root
         * @return 自顶向下,先判断该节点是否平衡，之后再向下递归。
         */

        int depth=0;
        public boolean IsBalanced_Solution(TreeNode root) {
            TreeNode temp=root;
            if(temp==null)
                return true;


            if (Math.abs(TreeDepth(temp.left) - TreeDepth(temp.right)) > 1)
                return false;
            else
                return IsBalanced_Solution(temp.left) && IsBalanced_Solution(temp.right);


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
