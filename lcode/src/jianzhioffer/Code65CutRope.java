package jianzhioffer;

public class Code65CutRope {
    public int cutRope(int target) {
        if (target < 2) {
            return 0;
        }
        if (target == 2) {//切割了的
            return 1;
        } if (target == 3)
            return 2;
            int[] max = new int[target+1];//max是没切割的+切割的
            max[0]=0;
            max[1] = 1;
            max[2] = 2;
            max[3] = 3;
            for (int i = 4; i <= target; i++) {
                int temp=Integer.MIN_VALUE;
                for (int j = 1; j < i / 2; j++) {
                    if (max[j] * max[i - j] > temp)
                        temp=max[j]*max[i-j];
                }
                max[i]=temp;
            }



        return max[target];
    }
}
