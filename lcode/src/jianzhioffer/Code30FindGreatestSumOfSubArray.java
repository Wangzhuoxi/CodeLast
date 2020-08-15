package jianzhioffer;

public class Code30FindGreatestSumOfSubArray {
    /**
     * 动态规划
     * @param array
     * @return
     */
    public int FindGreatestSumOfSubArray(int[] array) {
       int sum=array[0];
       int max=array[0];
       for(int i=1;i<array.length;i++)
       {

              sum=( sum>0?sum+array[i]:array[i]);
              max=max>sum?max:sum;
       }
       return max;

    }
}
