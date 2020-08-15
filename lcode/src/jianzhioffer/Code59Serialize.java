package jianzhioffer;

public class Code59Serialize {
    /**
     *序列化：加入根节点再调用函数分别执行左子树右子树
     * 反序列化：每一个进行反序列化。
     * 空时为# !
     */
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    String Serialize(TreeNode root) {
        String res="";
        if(root!=null)
        {
            res+=root.val+"!";
            res+=Serialize(root.left);
            res+=Serialize(root.right);
        }
        else
        {
            res+="#!";
        }

return  res;

    }
    int index=-1;
    TreeNode Deserialize(String str) {
        if(str==null||str.length()==0)
            return null;
        String[] temp=str.split("!");
        index++;
        if(index>=temp.length)
            return null;
        TreeNode root=null;

        if(!temp[index].equals("#"))//注意字符串相等用equals
        {
            root=new TreeNode(Integer.valueOf(temp[index]));

            root.left=Deserialize(str);
            root.right=Deserialize(str);
        }
        return root;


    }


}
