import java.util.ArrayList;
import java.util.Collections;

public class SortString {
    /**
     * 思想：递归。
     * 　将字符串看成两部分，一部分是第一个字符，另一部分是后面的所有字符。
     *
     * 　　首先确定第一个字符，该字符可以是字符串中的任意一个；固定第一个字符后，求出后面所有字符的排列（相同步骤，采用递归）。
     *
     * 　　实现第一个字符的改变，只需要将第一个字符和后面所有字符进行交换即可。要记得字符串输出后要将字符交换回来，变回原始的字符串。
     * @param str
     * @return
     */
    public ArrayList<String> Permutation(String str) {
        if(str==null)
            return null;
        ArrayList<String >lists =new ArrayList<>();
        if(str.length()<1)
        {
            return lists;
        }
        permutationCore(str.toCharArray(),lists,0);
        Collections.sort(lists);
        return lists;

    }

    public static void permutationCore(char[] str, ArrayList<String> lists,int index) {
        if (index == str.length - 1) {
            if (!lists.contains(String.valueOf(str)))//String.valueof  转化为String类型
                lists.add(String.valueOf(str));
        } else {
            for (int i = index; i < str.length; i++) {
                char c = str[i];
                str[i] = str[index];
                str[index] = c;
                permutationCore(str, lists, index + 1);
                char tmp = str[index];
                str[index] = str[i];
                str[i] = c;
            }
        }
    }
}
