package Greedy;

/**
 * 给定一个数组，求最后是否能到。数组每一个数表示步数
 * 解法：每⼀步都计算⼀下从当前位置最远能够跳到哪⾥，
 * 然后和⼀个全局最优的最 远位置		farthest对⽐，通过每⼀步的最优解，更新全局最优解，这就是 贪⼼。
 */

public class Leetcode55JumpGame {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int longest=0;
        for(int i=0;i<n-1;i++){
            longest=Math.max(longest,i+nums[i]);
            //如果遇到了0则不会继续跳动了
            if(longest==i)
                return false;
        }
        return longest>=n-1;

    }
}
