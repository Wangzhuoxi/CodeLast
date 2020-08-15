public class Code01KMP {
    /**
     * 利用kmp找到str2在str1中的开始位置
     * @param str1
     * @param str2
     * @return
     */
    public static int getIndexOf(String str1, String str2)
    {

        if(str1==null||str2==null||str1.length()==0||str2.length()==0||str1.length()<str2.length())
            return -1;
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        int i=0;
        int j=0;
        int[] getNext=getNext(arr2);
        while(i<arr2.length&&j<arr1.length)
        {
            //配上了
            if(arr1[j]==arr2[i])
            {
                i++;
                j++;
            }
            else
            {
                //如果没配上时，第二个字符串已经到了第一个字符的位置，那么第一个字符后移
                if(getNext[i]==-1)
                {
                    j++;
                }
                //没配上，字符串2转到他的最长公共前后缀的下一个位置和str1再匹配。
                else
                    i=getNext[i];
            }
        }
        return i==arr2.length?j-i:-1;//i==str2.length表示要被匹配的子串已经走完了，匹配成功。


    }
    //对要被匹配的子串的每个位置做最长前后缀相等个数的计算。str不包括自己。当跟主串对不齐时则看此表转到相应位置（此表既是位置也是个数）。
    public static int[] getNext(char[] arr)
    {
        if(arr.length==1)
            return new int[]{-1};
        int []res=new int[arr.length];
        res[0]=-1;
        res[1]=0;
        int pos=2;//pos后指针
        int cn=0;//cn是要不匹配时，跳到的位置，也就是当前的总共的最大子重复数
        //三种情况：
        //1.如果此时该位置的前一个与可以跳的位置值相等，则cn++。cn也是自己得最大重复得个数。
        //如果不相等但还可跳，就继续跳
        //如果没法跳了，等于0
        while(pos<res.length)//abcab
        {
            //cn是跳到的位置，跳到的位置的next数组是不包括自己的，同理由next[pos-1]跳到的，也不包括pos-1
            if(arr[pos-1]==arr[cn])//arr1arr0  arr2 arr0  arr[3]=arr0
                res[pos++]=cn++;//res[4]=1 pos=5 cn=1 res[5]=2
          //arr[pos-1!=arr[cn]],但cn还可以跳。
            else if (cn>0)
                cn=res[cn];
            //cn==0跳无可跳 等于0
            else
                res[pos++]=0;//res2=0 pos=3 res3=0 pos=4

        }
        return res;

    }
    public static void main(String[] args) {
        String str = "abcabcababaccc";
        String match = "ababa";
        System.out.println(getIndexOf(str, match));

    }
}
