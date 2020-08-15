package testTwice;

public class ReversePair {
    /**
     * 归并排序，找到前面的数大于后面的数的对数
     * @param array
     * @return
     */
    int count=0;
    public int InversePairs(int[] array) {
        if(array==null||array.length==0)
            return 0;
        divide(array,0,array.length-1);
        return count;
    }
    public void divide(int[] array,int l,int r)
    {
        if(l==r)
            return;
        int mid=l+(r-l)/2;
        divide(array,l,mid);
        divide(array,mid+1,r);
        merge(array,l,mid,r);
    }
    public void merge(int[] array,int l,int mid,int r)
    {
        int []help=new int[r-l+1];
        int left=l;
        int right=mid+1;
        int index=0;
       while(left<=mid&&right<=r)
       {
           if(array[left]>array[right]) {
               count += mid - left + 1;
               array[index++]=array[right++];

           }
           else
           {
               array[index++]=array[left++];
           }

       }
       while(left<=mid)
           help[index++]=array[left++];
       while(right<=r)
           help[index++]=array[right++];
index=0;
       for(int i=l;i<=r;i++)
  array[i]=  help[index++];
return;

    }

}