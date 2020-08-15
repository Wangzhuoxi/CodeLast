package jianzhioffer;

public class Code35InversePair_RESEE {
    /**
     * 归并排序的一种实现方式
     * @param array
     * @return
     */
    long count;
    public int InversePairs(int [] array) {
        count=0;
        int l=0;
        int r=array.length-1;
        divide(l,r,array);
        return (int)count%1000000007;

    }
    public void divide(int l,int r,int[] array)
    {
        if(l==r)
            return;
        int mid=(l+r)>>1;
        divide(l,mid,array);
        divide(mid+1,r,array);
        merge(l,mid,r, array);
    }
    public void merge(int l,int mid,int r,int[] array)
    {
        int index=0;
        int p1=l;//指向左侧的指针
        int p2=mid+1;//右侧的指针
        int[] temp=new int[r-l+1];//新的帮助数组
        while(p1<=mid&&p2<=r)
        {
            if(array[p1]>array[p2]) {
                count += mid - p1 + 1;
                temp[index++]=array[p2++];
            }
            else
            {
                temp[index++]=array[p1++];
            }

        }
       while(p1<=mid)
       {
           temp[index++]=array[p1++];
       }
       while(p2<=r)
       {
           temp[index++]=array[p2++];
       }
        index =0;
        for(int i=l;i<=r;i++)
            array[i]=temp[index++];
    }

}
