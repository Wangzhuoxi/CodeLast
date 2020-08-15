package testTwice;

public class MatchTwoString {
    public boolean match(char[] str, char[] pattern)
    {
        return MatchStr(str,0,pattern,0);
    }
    public boolean MatchStr(char[] str,int i ,char[] pattern ,int j)
    {
        if(i>=str.length&&j>=pattern.length)
            return true;
        if(j>=pattern.length&&i<str.length)
            return false;
        //第二个数 为*
        if(j<pattern.length-1&&pattern[j+1]=='*')
        {
            //s结束
            if(i==str.length)
                return MatchStr(str,i,pattern,j+2);
            //i，j第一个数相等时
            if(str[i]==pattern[j]||pattern[j]=='.')
               return MatchStr(str,i+1,pattern,j)||MatchStr(str,i+1 ,pattern,j+2)||MatchStr(str,i,pattern,j+2);
        //不相等
            if(str[i]!=pattern[j])
            return MatchStr(str,i,pattern,j+2);
        }
        //其他普通情况
        if(i>=str.length) return false;

        if(str[i]==pattern[j]||pattern[j]=='.')
            return MatchStr(str, i+1, pattern, j+1);
//以上的都不符合，直接false
return false;

    }
}
