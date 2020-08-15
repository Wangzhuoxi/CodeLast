public class HauseRobber2 {
    public int rob(int[] nums) {
        int n=nums.length;
        return Math.max(robMax(nums,0,n-2),robMax(nums,1,n-1));

    }
    public int robMax(int[] nums,int start,int end)
    {
       int[] dp=new int[nums.length];
       for(int i=end;i>=start;i--)
       {
           dp[i]=Math.max(dp[i+1],nums[i]+dp[i+2]);
       }

       return dp[end];
    }
}
