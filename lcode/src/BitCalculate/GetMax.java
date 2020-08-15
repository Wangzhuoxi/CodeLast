package BitCalculate;

public class GetMax {
    public static int getSign(int n)
    {
        return flip((n>>31)&1);
    }
    public static int flip(int a)
    {
        return a^1;
    }
    public  static int getMax(int a,int b)
    {
        //1.看二者是否异号
        int sa=getSign(a);
        System.out.println("sa的符号"+sa);
        int sb=getSign(b);
        System.out.println("sb的符号"+sb);
        int sameSign=sa^sb;
       return sameSign==0? (a*getSign(a-b)+b*flip(getSign(a-b))):(sa==1?a:b);
    }

    public static void main(String[] args) {
        System.out.println(getMax(1,-12));
    }
}
