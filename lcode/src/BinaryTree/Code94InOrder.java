package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code94InOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        Stack<TreeNode> tree=new Stack<>();
        TreeNode cur=root;
        while(!tree.isEmpty()||cur!=null) {
          if(cur!=null) {
                tree.push(cur);
                cur=cur.left;
            }
            else {
              cur = tree.pop();
              list.add(cur.val);
              cur = cur.right;
          }

        }
        return list;

    }
}
