package Greedy;

import javax.print.DocFlavor;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 解法：dp(nums[],p)代表p到结尾的最小的步数。用递归
 从0到n-
 */
public class Leetcode45JumpGame2 {

    public int jump(int[] nums) {
        int n=nums.length;
        int[] memo=new int[n];
        for(int i=0;i<n;i++)
            memo[n]=n;
        return dp(nums,0,memo);

    }
    public int dp(int[] nums,int p,int[] memo){
        int n=nums.length;
        if(p>=n-1)
            return 0;
        if(memo[p]!=n)
            return memo[p];
        int temp=nums[p];
        //在p点可以走的步数
        for(int i=1;i<=temp;i++){
            int	subProble =dp(nums,p+i,memo);
            memo[p]=Math.min(subProble+1,memo[p]);
        }
        return memo[p];

    }
}
