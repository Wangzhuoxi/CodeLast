package String;

public class _ReSEE_IsCountSame {
    public boolean isFormable(String str1 ,String str2)
    {
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        if(s1.length!=s2.length)
            return false;
        int[] count=new int[256];
        for(int i=0;i<s1.length;i++)
        {
            count[s1[i]]++;
        }
        for(int i=0;i<s1.length;i++)
        {
            if(count[s2[i]]--==0)//注意是先等于0再--！！！！！！！！！！
                return false;

        }
        return true;
    }
}
