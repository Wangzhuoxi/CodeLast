package BackPackage;

import java.util.Scanner;

public class CoinChange2 {
    /**
     * 每种硬币数量无数个，求有多少种方法能凑成。
     * dp[][] 为凑法的数量
     * 注意凑出目标金额为0时凑法为1
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int n=sc.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++)
            coins[i]=sc.nextInt();
        int[][]dp=new int[n+1][amount+1];
        //；如果凑出的⽬标⾦额为	0，那么“⽆为⽽治”就是 唯⼀的⼀种凑法。
        for(int i=1;i<=n;i++)
            dp[i][0]=1;
        for(int i=1;i<=n;i++)
            for(int j=1;j<=amount;j++)
            {
                if(coins[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                //注意此处，因为无数个所以当使用该硬币时，为dp[i][j-coins[i-1]
                else
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
            }
        System.out.println(dp[n][amount]);
        return;
    }
}
