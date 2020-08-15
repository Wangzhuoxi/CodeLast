public class Code28KMP {
    public static int strStr(String haystack, String needle) {
        if(needle==null||needle.length()==0)
            return 0;
        if(haystack==null||haystack.length()==0||haystack.length()<needle.length())
            return -1;

        int j=0;
        int i=0;
        char[] str1=haystack.toCharArray();
        char[] str2=needle.toCharArray();
        int[] next=getNext(needle);
        while(i<str1.length&&j<str2.length) {

            if (str1[i] == str2[j]) {
                i++;
                j++;
            }
            else if (next[j] == -1)
                i++;

            else
                j = next[j];
        }
        return  j==str2.length?i-j:-1;

    }


    public static int[] getNext(String str)
    {


        char[] arr=str.toCharArray();
        int[] next=new int[str.length()];
        next[0]=-1;
        if(str.length()==1)
            return next;
        next[1]=0;
        int i=2;
        int jump=0;
        while(i!=str.length())
        {
            if(arr[i-1]==arr[jump])
                //当next[i]确定时，i可以++
                next[i++]=++jump;
            else if(jump>0)
                jump=next[jump];
            else
                next[i++]=0;
        }
        return next;
    }
    public static void main(String[] args) {
        String str = "msissisippi";
        String match = "issip";
        System.out.println(strStr(str, match));

    }

}
