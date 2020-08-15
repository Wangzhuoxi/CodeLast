import java.util.HashMap;

public class HauseRobber3 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    HashMap<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null)
            return 0;
        if (map.containsKey(root))
            return map.get(root);
        int do_rob = root.val + (root.left == null ? 0 : (rob(root.left.left) + rob(root.left.right))) + (root.right == null ? 0 : (rob(root.right.left) + rob(root.right.right)));
        int not_rob = rob(root.left) + rob(root.right);
        return Math.max(do_rob, not_rob);

    }
}

