public class StringtoInt {
    public static int StrToInt(String str) {

        if (str == null || str.length() == 0)
            return 0;
        boolean isNegative = str.charAt(0) == '-';
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '+' || c == '-'))
                continue;
            if (c < '0' || c > '9')
                return 0;
            ret = ret * 10 + (c - '0');

        }
        if(isNegative==true&&(-ret) < (-2147483648))
            return 0;
        else
        if(isNegative==false&&ret>2147483647 )
            return 0;
        return isNegative ? -ret : ret;
    }

    public static void main(String[] args) {
        String  temp="-2147483649";
        System.out.println(StrToInt(temp));

    }
}
