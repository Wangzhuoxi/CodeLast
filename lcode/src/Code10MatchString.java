public class Code10MatchString {
    public boolean isMatch(String s, String p) {
        if((s==null&&p!=null)||(p==null&&s!=null))
            return false;
     return   matchString(s.toCharArray(),0,p.toCharArray(),0);
    }

    public boolean matchString(char[] s,int i,char[] p,int j)
    {
       if(j==p.length)
           return i==s.length;
       //下一个数字是空或者不是*
       if(j==p.length-1||p[j+1]!='*')
           return i!=s.length&&(s[i]==p[j]||p[j]=='.')&&matchString(s,i+1,p,j+1);
       while(i!=s.length&&(s[i]==p[j]||p[j]=='.'))
       {
           if(matchString(s,i,p,j+2))
               return true;
           i++;
       }
       return matchString(s,i,p,j+2);
    }
}
