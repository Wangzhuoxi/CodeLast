public class Code416Partition {
    /**
     *
     * @param nums
     * @return 是否可以将nums等分两份
     */
    public boolean canPartition(int[] nums) {
        //状态 sum  nums[i]   选择nums[i]要/不要  dp[i][j] 是否能凑成j
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        if(sum%2!=0)
            return false;
        sum=sum/2;
       boolean[] dp=new boolean[sum+1];
       dp[0]=true;
       for(int i=0;i<nums.length;i++)
        for(int j=sum;j>=0;j--)
        {
            if(j>=nums[i])
            {
                dp[j]=dp[j]||dp[j-nums[i]];

            }
        }
        return dp[sum];


    }
}
