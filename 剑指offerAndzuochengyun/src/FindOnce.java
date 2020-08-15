import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

public class FindOnce {
    //num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
     ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<array.length;i++) {
          if(temp.contains(array[i]))
          {
              temp.remove(temp.indexOf(array[i]));
          }
          else
              temp.add(array[i]);
        }
        num1[0]=temp.get(0);
        num2[0]=temp.get(1);



    }

    public static void main(String[] args) {
        int[] num={1,2,3,3,1,4};
        int[] num1=new int[1];
        int[] num2=new int[1];
        FindNumsAppearOnce(num,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

}
