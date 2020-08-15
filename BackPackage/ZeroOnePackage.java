package BackPackage;

import java.util.Scanner;

public class ZeroOnePackage {
    /**
     * 重量为w，数量为N个，每个物品有重量和价值两 个属性。其中第i个物品的重量为wt[i]，价值为val[i]
     * 求能装的最大val
     * 动态规划:dp[n][w]为背包容量为w的前n个物体的max val
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int n=sc.nextInt();
        int[] wt=new int[n];
        int[] val=new int[n];
        int[][] dp=new int[n+1][w+1];
      /*  for(int i=0;i<w+1;i++)
            dp[0][i]=0;
        for(int i=0;i<n+1;i++)
            dp[i][0]=0;*/
        for(int i=0;i<n;i++)
            wt[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            val[i]=sc.nextInt();
        for(int i=1;i<=n;i++)
            for(int j=1;j<=w;j++)
            {
                //当当前的物体重量大于剩余容量时，不装入
                if(wt[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                //找装入和不装的最大值 ：不装入和共i个物体j容量的最大值相同
              //  装了第i个物品，就要寻 求剩余重量w-wt[i-1]	限制下的最⼤价值
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-wt[i-1]]+val[i-1]);
            }
        System.out.println(dp[n][w]);
            return;
    }
}
