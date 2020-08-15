public class Code14LongestPrefix {
    public static  String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }
        String str = strs[0];
        //每个字符串与第一个比较。
       for(int i=1;i<strs.length;i++)
       {
           //当为空时一定有公共子串""
           while(strs[i].indexOf(str)!=0)
           {
               //子串一直减少，substring(a,b)的含义是从0开始，取b-a个长度作为子串。
               str=str.substring(0,str.length()-1);
           }
       }
       return str;
}

    public static void main(String[] args) {
        String[] str={"abcd","ab","abc"};
        System.out.println(longestCommonPrefix(str));
    }
}