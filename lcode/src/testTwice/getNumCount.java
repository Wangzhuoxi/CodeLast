package testTwice;

public class getNumCount {
    public int GetNumberOfK(int[] array,int k) {
        int m=getFirstofK(array,k);
        int n=getLastof(array,k);
        if(m!=-1&&n!=-1)
            return n-m+1;
        else
            return 0;
    }
    public int getFirstofK(int[] array,int k)
    {
        int l=0;
        int r=array.length-1;
        while(l<=r) {
            int mid=(l+r)>>1;
            if (array[mid] > k)
                r=mid-1;
            else if(array[mid]<k)
                l=mid+1;
            else if(mid!=0&&array[mid-1]==k)
                r=mid-1;
            else
                return mid;

        }
        return -1;
    }
    public int getLastof(int[] array,int k)
    {
        int l=0;
        int r=array.length-1;
        while(l<=r) {
            int mid=(l+r)>>1;
            if (array[mid] > k)
                r=mid-1;
            else if(array[mid]<k)
                l=mid+1;
            else if(mid!=array.length-1&&array[mid+1]==k)
                l=mid+1;
            else
                return mid;

        }
        return -1;
    }
}
