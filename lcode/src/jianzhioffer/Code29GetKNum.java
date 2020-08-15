package jianzhioffer;


import java.util.ArrayList;
import java.util.Collections;

public class Code29GetKNum {
    /**
     * 冒泡
     * @param input
     * @param k
     * @return
     */
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> list=new ArrayList<>();
        if(input==null||input.length==0||k>input.length)
            return list;

        for(int i=0;i<k;i++)
        {
            for(int j=input.length-1;j>i;j--)
            {
            if(input[j]<input[j-1])
            swap(input,j,j-1);
            }
            list.add(input[i]);
        }


        return list;


    }

    public static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] temp={4,5,1,6,2,7,3,8};
        ArrayList<Integer> list=GetLeastNumbers_Solution(temp,2);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
    }