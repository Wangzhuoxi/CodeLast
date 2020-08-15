package jianzhioffer;

public class Code49StringToInt {
    public int StrToInt(String str) {
        if (str == null || str.trim().length() == 0) {
            return 0;
        }
        int index=0;
        long res=0;
        boolean isPos=true;
        if(str.charAt(0)=='+'||str.charAt(0)=='-')
        {
            index=1;
            if(str.charAt(0)=='-')
                isPos=false;
        }
        for(int i=index;i<str.length();i++)
        {
            if(str.charAt(i)-'0'>9||str.charAt(i)-'0'<0)
                return 0;
            res=res*10+((str.charAt(i)-'0')*(isPos?1:-1));
            if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)
                return 0;

        }
        return (int)res;

    }

}
