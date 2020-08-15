public class ExpressionMatch {
    public static boolean isMatch(String str, String exp)
    {
        char[] s=str.toCharArray();
        char[] e=exp.toCharArray();
        if(s==null||e==null)
            return false;
        return isValid(s,e)?process(s,e,0,0):false;

    }
    public static boolean isValid(char[] s,char[] e)
    {
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='*'||s[i]=='.')
                return false;
        }
        for(int i=1;i<e.length;i++)
        {
            if(e[i]=='*'&&(i==0||e[i-1]=='*'))
                return false;
        }
        return true;
    }
    public static boolean process(char[] s,char[] e,int i,int j)
    {

        if (j == e.length) {
            return i == s.length;
        }

        //总共三种情况：e下一个无字符，有字符不是*，有字符是*
        //e下一个无字符或者下一个子符不是*
        if(j+1==e.length||e[j+1]!='*')
        {
          return i!=s.length&&(e[j]==s[i]||e[j]=='.')&&process(s,e,i+1,j+1);
        }
        //下一个是*

           while(i!=s.length&&(e[j]==e[i]||e[j]=='.'))
           {
               if(process(s,e,i,j+2))//j,j+1（a *）当1个a,2个a，三个a..........
                   return true;
               i++;
           }
           //j+1 *时，首字符配不上那么直接当0个。
           return process(s,e,i,j+2);
       }
    public static void main(String[] args) {
        String str = "abcccdefg";
        String exp = "ab.*d.*e.*";
        System.out.println(isMatch(str, exp));
    //    System.out.println(isMatchDP(str, exp));

    }

}
