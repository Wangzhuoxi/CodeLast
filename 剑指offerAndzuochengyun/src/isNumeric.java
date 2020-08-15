public class isNumeric {
        public static  boolean isNumeric(char[] str) {
            if(str==null||str.length==0)
                return false;
            if(str.length==1&&str[0]>48&&str[0]<57)
                return true;
            int index=0;
            if(str[0]=='+'||str[0]=='-')
                index=1;
            int dotcount=0;
            int ecount=0;
            for(int i=index;i<str.length;i++)
            {
                if(str[i]=='-'||str[i]=='+') {
                    if (str[i - 1] != 'e' && str[i - 1] != 'E') {
                        System.out.println(str[i]);
                        return false;
                    }
                    else
                        continue;
                }
                if(str[i]=='e'||str[i]=='E')
                {
                    ecount++;
                    if(ecount>1) {
                        System.out.println(str[i]);
                        return false;
                    }
                    if(i==str.length-1||i==0||str[i-1]>57||str[i-1]<48) {
                        System.out.println(str[i]);
                        return false;
                    }

                    continue;
                }
                if(str[i]=='.') {
                    dotcount++;
                    if(dotcount>1) {
                        System.out.println(str[i]);
                        return false;
                    }
                    continue;
                }
                if (str[i] < 48 || str[i] > 57) {
                    System.out.println(str[i]);
                    return false;
                }
            }
return true;
    }

    public static void main(String[] args) {

       String str= "12e+5.4";
        System.out.println(isNumeric(str.toCharArray()));

    }
}
