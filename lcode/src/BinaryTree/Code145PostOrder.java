package BinaryTree;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code145PostOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty())
        {
            TreeNode cur=stack1.pop();
            stack2.push(cur);
            if(cur.left!=null)
                stack1.push(cur.left);
            if(cur.right!=null)
                stack2.push(cur.right);
        }
        while(!stack2.isEmpty())
        {
            list.add(stack2.pop().val);
        }
        return list;

    }
}
