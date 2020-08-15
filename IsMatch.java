public class IsMatch {
    public boolean isMatch(String s, String p) {
        if(s==null||p==null)
            return false;
        return ifMatch(s.toCharArray(),0,p.toCharArray(),0);

    }

    /**
     * 前提：m可以在终点等着n.d必须在有*情况下
     * @param s
     * @param m
     * @param p
     * @param n
     * @return
     */
    public boolean ifMatch(char[] s,int m,char[] p,int n)
    {

        if(m>=s.length&&n>=p.length)
            return true;
        //当p先结束，不可能
        if(m<s.length&&n>=p.length)
            return false;
        if(n<p.length-1&&p[n+1]=='*')
        {
            if(m==s.length)
                return ifMatch(s,m,p,n+2);
        else    if(s[m]==p[n]||p[n]=='.')
                return ifMatch(s,m+1,p,n+2)||ifMatch(s,m,p,n+2)||ifMatch(s,m+1,p,n);
        else
            return ifMatch(s,m,p,n+2);
        }
        else if(m>=s.length)
            return false;
        else{
            return (s[m]==p[n]||p[n]=='.')&&ifMatch(s,m+1,p,n+1);
        }

    }
}
