package jianzhioffer;

/**
 * 总共分几种情况：
 * 1.两者都结束了 str.length<=s&&pattern.length<=p 成功！
 * 2.pattern结束了，str没结束，那么false
 * 其他：两者都没结束+s结束p没结束，按下一个数是否为*分两大种情况。每一种都要考虑s结束==str.length单独处理。
 * {
 *     1.pattern[p+1]为*：
 *      （1）str结束了，直接匹配matchCore(str, s, pattern, p+2);
 *      （2）str没结束
 *              a.现在两者的第一个字符相等。3种情况。复杂的那个。
 *              b.第一个字符不相等。matchCore(str, s, pattern, p+2);

 *     2.pattern[p+1]不为*：
 *     （1）str到头了就不对了。
 *     （2）str没到头：matchCore(str, s+1, pattern, p+1);
 *
 * }
 */
public class Code52Match2String {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) return false;

        return matchCore(str, 0, pattern, 0);
    }

    public boolean matchCore(char[] str,int s, char[] pattern,int p) {
        if(str.length<=s&&pattern.length<=p)
            return true;//都匹配完了
        if(str.length>s&&pattern.length<=p)
            return false;//模式完了，字符串还有
        //模式串a*a没结束，匹配串可结束可不结束

        if(p+1<pattern.length&&pattern[p+1]=='*'){//当前pattern的下一个是*号时

            //字符串完了
            if(s>=str.length) return matchCore(str, s, pattern, p+2);
            //字符串还没完
            else{
                if(pattern[p]==str[s]||pattern[p]=='.'){
                    //当前位置匹配完成，移动到下一个模式串
                    return matchCore(str,s+1, pattern,p+2)
                            ||matchCore(str,s+1, pattern,p)
                            ||matchCore(str,s, pattern,p+2);
                }else
                    return matchCore(str, s, pattern, p+2);
            }
        }
        //当前pattern的下一个不是*时候
        if(s>=str.length) return false;
        else{
            if(str[s]==pattern[p]||pattern[p]=='.')
                return matchCore(str, s+1, pattern, p+1);
        }
        return false;



    }


}
