import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Code111MinDepth
{
    /**
     * BFS
     */
      public class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

        public int minDepth(TreeNode root) {
          int depth=1;
            Queue<TreeNode> queue=new LinkedList<>();
            HashSet<TreeNode> set=new HashSet<>();
            queue.add(root);
            set.add(root);
            while(!queue.isEmpty())
            {
                int size=queue.size();
                for(int i=0;i<size;i++)
                {
                    TreeNode temp=queue.poll();
                    if(temp.left==null&&temp.right==null)
                        return depth;
                    if(temp.left!=null)
                    {
                        queue.add(temp.left);
                        set.add(temp.left);
                    }
                    if(temp.right!=null)
                    {
                        queue.add(temp.right);
                        set.add(temp.right);
                    }
                }
                depth++;

            }
            return depth;

        }

}
