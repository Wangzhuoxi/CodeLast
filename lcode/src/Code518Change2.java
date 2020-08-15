public class Code518Change2 {
    /**
     *
     * @param amount
     * @param coins：不同价值的硬币，每个数量不限制
     * @return 一共多少种凑法
     */
    public int change(int amount, int[] coins) {
        //选择：该种硬币要/不要 状态：amount，coin的硬币种类 dp[][amount] 结果是到该amount的凑法
        if(amount==0)
            return 1;
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        //当金额为0时，只有一种凑硬币的方式，都不要。
        for(int i=1;i<n+1;i++)
            dp[i][0]=1;
        for(int i=1;i<n+1;i++)
            for(int j=1;j<amount+1;j++)
            {
                if(j>=coins[i-1])
                {
                    //两种选择
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                }
                //当当前的coin大于需要的amount，只能不要
                else
                    dp[i][j]=dp[i-1][j];
            }
        return dp[n][amount];

    }
}
