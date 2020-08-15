package jianzhioffer;

public class Code31NumberOf1 {

    /**
     * 从1到n 1的个数
     * @param n
     * @return
     */
    public static  int NumberOf1Between1AndN_Solution(int n) {
      int res=0;
      for(int i=1;i<=n;i++)
          res+=getNum(i);
      return res;
    }
    public  static int getNum(int i)
    {
        int num=0;
        while(i!=0)
        {
            if(i%10==1)
                num++;
            i=i/10;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }
}
