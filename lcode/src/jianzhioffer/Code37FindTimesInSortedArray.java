package jianzhioffer;

public class Code37FindTimesInSortedArray {
    public static int GetNumberOfK(int[] array,int k) {
        if(array==null||array.length==0)
            return 0;
        int start=getStartNum(array,0,array.length-1,k);
        int end=getLastNum(array,0,array.length-1,k);
        if(start != -1 && end != -1) {
            return end - start + 1;
        }
        return 0;
    }
    public static int getStartNum(int[] array,int start,int end,int k)
    {
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(array[mid]>k)
                end=mid-1;
            else  if(array[mid]<k)
                start=mid+1;
            else if(mid!=0&&array[mid-1]==k)
                end=mid-1;
            else
                return mid;
            mid = (start + end) / 2;
        }
        return -1;
    }



    public static int getLastNum(int[] array,int start,int end,int k)
    {
        if(start > end) {
            return -1;
        }
        int mid=(start+end)/2;

        if(array[mid]>k)
            return     getLastNum(array,start,mid-1,k);
        else if (array[mid] < k)
            return   getLastNum(array, mid+1, end, k);
        else if (mid != array.length - 1 && array[mid + 1] == k)
            return    getLastNum(array, mid+1, end, k);
        else
            return mid;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,4,5};
        System.out.println(GetNumberOfK(arr,3));
    }
    }


