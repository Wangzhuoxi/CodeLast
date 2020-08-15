package jianzhioffer;

import java.util.Arrays;

public class Code45PokerProblem_RESEE {
    public static boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length<5)
            return false;
       Arrays.sort(numbers);
      int nums0=0;
      int num_0_need=0;
      int i=0;
      for(;i<numbers.length;i++) {
          if (numbers[i] == 0)
              nums0++;
          else
              break;
      }
      for(int j=i+1;j<numbers.length;j++)
      {
          if(numbers[j]==numbers[j-1])
              return false;
          else
              num_0_need+=numbers[j]-numbers[j-1]-1;
      }
      if(num_0_need>nums0)
return false;
      else
          return true;
    }

    public static void main(String[] args) {
       int[] re={ 1,3,2,5,4};
        System.out.println(isContinuous(re));

    }
}
