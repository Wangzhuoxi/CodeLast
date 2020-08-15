package jianzhioffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 奇数从左到右打印二叉树的一层
 * 偶数从右到左打印
 * 思路：
 * 用两个栈，当遍历当前层时，记录下一层。奇数层时下一层要从右到左打印，所以左子树先进。
 * 两个栈都空，结束。
 */
public class Code57ZhiPrintTree_RESEE {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null)
            return lists;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        boolean toRight=true;
        s1.push(pRoot);
        while(!s1.isEmpty()||!s2.isEmpty())
        {
            if(toRight)
            {
                ArrayList<Integer> list=new ArrayList<>();
                while(!s1.isEmpty()) {
                    TreeNode temp = s1.pop();
                    list.add(temp.val);
                    if(temp.left!=null)
                        s2.push(temp.left);
                    if(temp.right!=null)
                        s2.push(temp.right);
                }
                lists.add(list);
                toRight=!toRight;

            }
            else
            {
                ArrayList<Integer> list=new ArrayList<>();
                while(!s2.isEmpty()) {
                    TreeNode temp = s2.pop();
                    list.add(temp.val);
                    if(temp.right!=null)
                        s1.push(temp.right);
                    if(temp.left!=null)
                        s1.push(temp.left);
                }
                lists.add(list);
                toRight=!toRight;
            }
        }
        return lists;


    }
}
