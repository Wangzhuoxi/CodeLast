import java.math.BigInteger;

public class code07ReverseInt {
    public static int reverse(int x) {
        long res=0;
        while(x!=0)
        {
            res=res*10+x%10;
            x=x/10;
        }
        return (res<Integer.MIN_VALUE || res>Integer.MAX_VALUE) ? 0:(int)res;
    }
    }
