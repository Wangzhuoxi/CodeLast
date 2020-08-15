package String;

public class RemoveContinousK {
    public static String removeKZeros(String str,int k)
    {
        if(str==null||str.length()==0||k<1)
        {
            return str;
        }
        int start=-1;
        int count=0;
        char[] s=str.toCharArray();
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='0')
            {
                count++;
                start=start==-1?i:start;
            }
            //当字符不是0时，此时对之前的count做个结算。如果此时count==k则证明符合条件，全部变为空。ascii0 为空。
            //count如果不符合条件则归0.count0start-1
            else
            {
                if(count==k)
                {
                    while(count!=0)
                    {
                        count--;
                        s[start++]=0;
                    }

                }
                else
                {
                    count=0;
                    start=-1;
                }
            }
        }

        //最后符合条件，后面无其他字符
        if(count==k) {
            while (count != 0) {
                count--;
                s[start++] = 0;
            }
        }
        for(int i=0;i<s.length;i++)
        System.out.println(s[i]);
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        System.out.println(removeKZeros("A0000B000",3));
    }
}
