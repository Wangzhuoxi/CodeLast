package jianzhioffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code28FindMoreThanHalf {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++) {

            if(map.containsKey(array[i])) {
               int res= map.get(array[i]);
                map.put(array[i], ++res);
            }
            else
                map.put(array[i],1);
        }
   for(Integer a: map.keySet())
   {
       if(map.get(a)>len)
           return a;
   }
   return 0;
    }
}
