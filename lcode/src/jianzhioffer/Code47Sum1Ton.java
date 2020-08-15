package jianzhioffer;

public class Code47Sum1Ton {
    public int Sum_Solution(int n) {
        int ans=n;
        boolean a=  (n>0)&&((ans = n + Sum_Solution(n - 1)) > 0);
        return ans;
    }
}
