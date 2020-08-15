package String;

public class _RESEE_SumInString {
    public  static int numSum(String str)
    {
        int num=0;
        int res=0;
        Boolean isPos=true;
        char[] temp=str.toCharArray();
        for(int i=0;i<temp.length;i++)
        {
            int cur=temp[i]-'0';
            if(temp[i]<'0'||temp[i]>'9')
            {
                res+=num;
                if(temp[i]=='-')
                {
                    if(i-1>-1&&temp[i-1]=='-')
                        isPos=!isPos;
                    else
                        isPos=false;
                }
                else
                    isPos=true;
                num=0;
            }
            else
            {
                num=num*10+(isPos?cur:-cur);
            }

        }
        res+=num;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numSum("A1.3"));

    }
}
