import java.util.Scanner;

public class FourKeyBorad {
    /**
     * A ，ctrlA 选中 ctrlC复制 vtrlV粘贴 N步，如何A最多
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getMaxA(n);
        return ;
    }
    //dp[x] 第x次操作后显示的A的个数
    public static void getMaxA(int n)
    {
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++)
        {
            dp[i]=dp[i-1]+1;
            //
            //j		作为若⼲		C-V		的起点,之后开始cv
            for(int j=2;j<=i;j++)
            {
                dp[i]=Math.max(dp[i],dp[j-2]*(i-j+ 1));
            }
        }
        System.out.println(dp[n]);
        return;
    }
}
