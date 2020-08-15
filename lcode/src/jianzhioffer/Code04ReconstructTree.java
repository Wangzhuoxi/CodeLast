package jianzhioffer;

import java.util.Arrays;

public class Code04ReconstructTree {
    public class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        int i=0;
        TreeNode head=new TreeNode(pre[0]);
        for(;i<pre.length;i++)
        {
            if(pre[0]==in[i])
                break;
        }

        head.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
        head.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in, i + 1, in.length));
return head;
    }
}
