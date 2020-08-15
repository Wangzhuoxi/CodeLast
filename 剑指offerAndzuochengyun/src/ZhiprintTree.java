import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ZhiprintTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null)
            return res;
        Stack<TreeNode> s1 = new Stack<>();  // s1表示奇数，从右向左输出
        Stack<TreeNode> s2 = new Stack<>();  // s2表示偶数，从左向右输出
        s1.push(pRoot);
        int level = 1;
        while (!s1.empty() || !s2.empty()) {
            if (level % 2 != 0) {
                ArrayList<Integer> list = new ArrayList<>();
                while (!s1.empty()) {
                    TreeNode node = s1.pop();
                    if (node != null) {
                        list.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }

                if (!list.isEmpty()) {
                    res.add(list);
                    level++;
                }
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                while (!s2.empty()) {
                    TreeNode node = s2.pop();
                    if (node != null) {
                        list.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }

                if (!list.isEmpty()) {
                    res.add(list);
                    level++;
                }
            }
        }
        return res;
    }

    }
