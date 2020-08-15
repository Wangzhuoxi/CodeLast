package jianzhioffer;
import java.util.*;
public class Code24SumPath_RESEE {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

if(root==null)
    return lists;
findPath(root,target);
return lists;
    }
    public void findPath(TreeNode root,int target) {
        path.add(root.val);
        if (root.left==null&&root.right==null&&root.val==target)
        {
            lists.add(new ArrayList<>(path));
        }
        if(root.left!=null)
            findPath(root.left,target-root.val);
       if(root.right!=null)
           findPath(root.right,target-root.val);
       path.remove(path.size()-1);
    }
}