import javafx.scene.input.DataFormat;
import sun.reflect.generics.tree.Tree;
import sun.security.krb5.internal.crypto.Des;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class SerialTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * 先序遍历
     * @param root
     * @return
     */
    public static String Serialize(TreeNode root) {
   String list="";
   if(root!=null)
   {
       list+=root.val+"!";
       list+=Serialize(root.left);
       list+=Serialize(root.right);

   }
   else
       list+="#!";

return list;
    }
    public int index=-1;
  public TreeNode Deserialize(String str) {
        if(str==null||str.length()==0)
            return null;
      String[] strs=str.split("!");
      index++;
      if(index>=strs.length)
          return null  ;
      TreeNode root=null;
      /**
       * == 表示 判断2个变量或对象实例是否指向同一个内存空间，equals()表示 判断2个变量或对象实例所指向的内存空间的值是否相同。
       * 2、== 表示 对内存地址进行比较，equals()表示 对字符串的内容进行比较
       */
      if (!strs[index].equals("#")) {
          root = new TreeNode(Integer.valueOf(strs[index]));
          root.left=Deserialize(str);
          root.right=Deserialize(str);

      }
      return root;

        }

    }

