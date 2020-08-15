package jianzhioffer;

import java.util.*;

public class Code40_FindAppearOnce {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果

        public  static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
           HashSet<Integer> set=new HashSet<>();
            int[] num=new int[2];
            int index=0;
            for(int i=0;i< array.length;i++)
            {
                if(set.contains(array[i]))
                {

                  set.remove(array[i]);
                }
                else
                    set.add(array[i]);
            }
           for(Integer s:set)
               num[index++]=s;
            num1[0]=num[0];
            num2[0]=num[1];

        }


    public static void main(String[] args) {
        int[] temp={2,4,3,6,3,2,5,5};
        int[] num1=new int[1];
        int[] num2=new int[1];
        FindNumsAppearOnce(temp,num1,num2);

        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
