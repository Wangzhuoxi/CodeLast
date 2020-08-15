package jianzhioffer;

import java.util.Collections;

public class Code34FindFirstOnce {
    public int FirstNotRepeatingChar(String str) {
       int[] res=new int[256];
       for(int i=0;i<str.length();i++)
       {
           res[str.charAt(i)]++;
       }
        for(int i=0;i<str.length();i++)
       {
           if(res[str.charAt(i)]==1)
               return i;
       }
       return -1;
}
}
