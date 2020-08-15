package testTwice;

public class SumBiggestInArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum=Integer.MIN_VALUE;
        int temp=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(temp<0) {

                temp = array[i];
            }
            else
                temp+=array[i];
            sum=Math.max(temp,sum);
        }
        return sum;
    }
}
