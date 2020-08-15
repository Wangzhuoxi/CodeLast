package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Code22PrintBinaryTree_RESEE {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

     Queue<TreeNode> queue=new LinkedList<>();
     ArrayList<Integer> list=new ArrayList<>();
     if(root==null)
         return list;
     queue.add(root);
     while(!queue.isEmpty())
     {
       TreeNode temp=queue.poll();
       list.add(temp.val);
       if(temp.left!=null)
         queue.add(temp.left);
       if(temp.right!=null)
           queue.add(temp.right);
     }
     return list;
        }

    }
}
