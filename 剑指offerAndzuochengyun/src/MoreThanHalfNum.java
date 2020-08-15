import jdk.nashorn.internal.runtime.FindProperty;
import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

public class MoreThanHalfNum {
    private static int count;

    public int InversePairs(int [] array) {

        int len = array.length;
        mergeSort(0, len-1,  array);
        return count;
    }
    public static void mergeSort(int start,int end,int[] array)
    {
        if(start==end)
            return;
        int m=start+(end-start)/2;
        mergeSort(start,m,array);
        mergeSort(m+1,end,array);
        merge(start,end,m,array);
    }
    public static void merge(int start,int end,int m,int[] array)
    {
        int s=0;
        int[] temp=new int[end-start+1];
        int c=0;
        int index=m+1;
        while(start<=m&&index<=end) {
            if (array[start] < array[index])
                temp[c++]=array[start++];
            else {
                temp[c++] = array[index++];
                count+=m-start+1;
                count %= 1000000007;
            }
        }
        while (start <= m) {
            temp[c++] = array[start++];
        }

        while (index <= end) {
            temp[c++] = array[index++];
        }

        for (int d : temp) {
            array[s++] = d;
        }
    }

    }


