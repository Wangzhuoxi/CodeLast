package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code144PreOrder {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

        public List<Integer> preorderTraversal(TreeNode root) {
            ArrayList<Integer> res=new ArrayList<>();
          if(root==null)
              return res;
            Stack<TreeNode> tree=new Stack<>();
            tree.add(root);
            while(!tree.isEmpty()) {
                TreeNode temp = tree.pop();
                res.add(temp.val);
                if (temp.right != null)
                    tree.add(temp.right);
                if (temp.left != null)
                    tree.add(temp.left);
            }
            return res;


        }

}
