package BackPackage;

import java.util.Scanner;

/**
 * 给定多张优惠券，凑成正好的钱数，用最少的硬币
 */
public class CouponToItem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            int p=sc.nextInt();
            if(p==0)
                break;
            int[] dp=new int[p+1];
            for(int i=0;i<dp.length;i++) {
                    dp[i] = -1;
            }
            int m=sc.nextInt();
            int[] a=new int[m];
            for(int i=0;i<m;i++)
            {
                a[i]=sc.nextInt();
                System.out.println("ai ="+a[i]);
                if(a[i]<=p)
                dp[a[i]]=1;
            }

           getCoupon(a,dp);
        }
        return;

    }
    public static void getCoupon(int[] a,int[] dp){
        for(int i=0;i<dp.length;i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println("i is"+i);

                if (a[j] < i && dp[i - a[j]] != -1) {
                    if (dp[i] == -1) {
                        dp[i] = dp[i - a[j]] + 1;
                    } else {
                        System.out.println("dp[i] is"+dp[i]);
                        dp[i] = Math.min(dp[i - a[j]] + 1, dp[i]);
                    }
                }
            }
        }
        int p=dp.length-1;
if(dp[p]==-1)
    System.out.println("IMPOSSIBLE");
else
    System.out.println(dp[p]);

return ;
    }
}
