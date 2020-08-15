package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 思路：用start、end来记录上一层。出队start++,直到和end相等。表示这一层全部弹出
 * 开始下一层.start=0。end=queue.soze
 */
public class Code58PrintAsRow {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int start=0;
        int end=1;
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        if(pRoot==null)
            return lists;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        ArrayList<Integer> list=new ArrayList<>();
        while(!queue.isEmpty())
        {

            TreeNode node=queue.poll();
            list.add(node.val);
            start++;
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
            if(start==end)
            {
                start=0;
                end=queue.size();
                lists.add(list);
                list=new ArrayList<>();
            }
        }
return lists;
    }
}
