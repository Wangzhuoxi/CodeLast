package jianzhioffer;

public class Code11NumOf1_RESEE {
    //int 32位，每一位&1，是1则count+1，不是则加0.
    public int NumberOf1(int n) {
        int count = 0;
        for(int i=0;i<32;i++) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
}
