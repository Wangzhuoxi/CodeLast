import java.util.ArrayList;
import java.util.LinkedList;

public class PrintAllRows {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        int start=0;//父节点的起始指针
        int end=1;//父节点的结束指针
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.pop();
            start++;
            list.add(temp.val);

            if (temp.left != null)
                queue.offer(temp.left);
            if (temp.right != null)
                queue.offer(temp.right);
            if (start == end) {
                System.out.println(list);
                start = 0;
                end = queue.size();
                lists.add(new ArrayList<>(list));
                list.clear();
            }
        }
            return lists;
        }

    public static void main(String[] args) {
        TreeNode father=new TreeNode(8);
        father.left=new TreeNode(6);
        father.right=new TreeNode(10);
        TreeNode right=father.right;
        TreeNode left=father.left;
        left.left=new TreeNode(5);
        left.right=new TreeNode(7);
        right.left=new TreeNode(9);
        right.right=new TreeNode(11);
        System.out.println(Print(father));
    }
    }

