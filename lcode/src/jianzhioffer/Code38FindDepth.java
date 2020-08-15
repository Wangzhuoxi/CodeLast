package jianzhioffer;

public class Code38FindDepth {

     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;
     }
     }
int depth=0;
        public int TreeDepth(TreeNode root) {
         TreeNode temp=root;
         int left=0;
         int right=0;
         if(temp.left==null&&temp.right==null)
             return 0;
         if(temp.left!=null)
        left=TreeDepth(temp.left)+1;
         if(temp.right!=null)
          right=TreeDepth(temp.right)+1;
         depth=Math.max(left,right);
         return depth;
        }
    }

