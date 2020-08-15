import sun.reflect.generics.tree.Tree;

import java.util.Arrays;

public class Solution {
    public static int getNumberOfK(int[] data,int k){
        int start = getStartOfK(data,k);
        if(start==-1)
            return 0;
        int end = getEndOfK(data,start,k);
        return end-start+1;
    }
    public static int getStartOfK(int[] data,int k){
        if(data[0]>k || data[data.length-1]<k)
            return -1;
        int left = 0,right = data.length-1,mid;
        while (left<=right) {
            if(right==left){
                if(data[left]==k)
                    return left;
                else
                    return -1;
            }
            //当长度为2，mid取左值
            mid = left + (right - left) / 2;
            if (data[mid] > k)
                right = mid-1;
            else if(data[mid] < k)
                left = mid+1;
            else
                right = mid;
        }
        return -1;
    }
    public static int getEndOfK(int[] data,int start, int k){
        int left = start,right = data.length-1,mid;
        while (left<=right){
            if(left==right){
                if(data[left]==k)
                    return left;
                else
                    return -1;
            }
            //当长度为2，mid取右值
            mid = left + (right - left + 1) / 2;
            if (data[mid] > k)
                right = mid-1;
            else if(data[mid] < k)
                left = mid+1;
            else
                left = mid;
        }
        return -1;
    }
}
