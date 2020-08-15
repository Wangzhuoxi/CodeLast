package BackPackage;

import java.util.Scanner;

public class CoinChange {
    /**
     * 几种硬币，一个amount 每种硬币数量不限 求最少的硬币数量
     * @param args
     * 思路：状态amount dp表示用的最少的硬币数
     */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int n=sc.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++)
            coins[i]=sc.nextInt();
        int res=Integer.MAX_VALUE;
        coinChange(amount,coins,res);
        System.out.println(res);
        return;

    }
    public static int coinChange(int amount,int[] coins,int res)
    {
        if(amount<0)
            return -1;
        if(amount==0)
            return 0;
        //状态：amount 选择：coin
      for( int coin:coins)
      {
          //递归，凑不成则不选择该方法。
          int temp=coinChange(amount-coin,coins,res);
          if(temp<0)
              continue;
          res=Math.min(res,temp+1);
      }
     return res==Integer.MAX_VALUE?-1:res;
    }
}
