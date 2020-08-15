public class CoinWays {
  public int findWays(int[] arr,int aim)
  {
      return process1(arr,0,aim);
  }

    /**
     * 暴力递归方法
     * @param arr
     * @param index
     * @param aim
     * @return
     */
  public int process1(int[] arr,int index,int aim)
  {
      int res = 0;
      if(index==arr.length-1)
      {
          res=aim==0?1:0;
      }
      for(int i=0;i*arr[i]<=aim;i++)
      res+=process1(arr, index + 1, aim - arr[index] * i);
      return res;
  }

}
