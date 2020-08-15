public class HouseRobber {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+2];
        dp[n]=0;
        dp[n+1]=0;
        //只和之后的两个状态有关
        for(int i=n-1;i>=0;i--)
        {
            dp[i]=Math.max(dp[i+1],nums[i]+dp[i+2]);
        }
        return dp[0];

}
}
