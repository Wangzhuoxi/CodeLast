import java.util.Scanner;

/**
 * 背包问题
 * 前a个物品，dp[a][b]  b是当前背包的余量，dp数组表示最后的value和
 * 注意a是第a个物体，那么对应到value要a-1
 */
public class DivideIntoTwoGroup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            sum+=x[i];
        }
        System.out.println(maxValue(n,x,sum/2));

        return;
    }

    public static int maxValue(int N, int[] value, int V) {
        int[][] dp=new int[N+1][V+1];
     if(N<=0)
         return 0;
     if(V<=0)
         return 0;
        for(int i=1;i<=N;i++)
            for(int j=1;j<=V;j++)
            //如果当前的value大于背包剩余的余量，则不往里装
            {
                if(value[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-value[i-1]]+value[i-1]);
                }
        return dp[N][V];

    }
}


