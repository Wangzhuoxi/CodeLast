package BFS;

import javax.crypto.spec.DESedeKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 找到二叉树的最小深度，bfs
 */
public class MinDepth {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

        public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
            //root本来就是一层
            int depth=1;
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = queue.poll();
                    if (temp.left == null && temp.right == null)
                        return depth;
                    if (temp.left != null) {
                        queue.offer(temp.left);
                    }
                    if (temp.right != null)
                        queue.offer(temp.right);
                }
                depth++;
            }
            return depth;
            }

        }

