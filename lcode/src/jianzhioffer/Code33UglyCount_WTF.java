package jianzhioffer;

public class Code33UglyCount_WTF {
    /**
     * 求第index个丑数，丑数时只能被1235整除的数
     * 第一个丑数为1
     * @param index
     * @return
     */
    public int GetUglyNumber_Solution(int index) {
        if(index<1)
            return 0;
        if(index==1)
            return 1;
       int t2=0;
       int t3=0;
       int t5=0;
       int[] res = new int[index];
       res[0]=1;
       for(int i = 1;i < index;i++)
       {
           res[i]=Math.min(Math.min(res[t2]*2,res[t3]*3),res[t5]*5);
           if(res[i]==res[t2]*2)
               t2++;
           else
               if(res[i]==res[t3]*3)
                   t3++;
           else
               t5++;
       }
       return res[index-1];
    }
}
