public class Code01MergeSortFindSum_RESEE {
    /**
     * 找一个数组的小和
     * 找在他之前的所有的比他小的和，整个数组相加
     */
    public static int getSum(int[] num)
    {
        if(num==null||num.length==0)
            return 0;
        return mergeSum(num,0,num.length-1);
    }
    public static int mergeSum(int[] num,int l,int r)
    {
        if(l==r)
            return 0;
        int mid=l+(r-l)/2;
       return mergeSum(num,l,mid)+mergeSum(num,mid+1,r)+merge(num,l,mid,r);

    }
    public static int merge(int[] num,int l,int mid ,int r)
    {
        int res=0;
        int[] help=new int[r-l+1];
        int index=0;
        int p1=l;
        int p2=mid+1;
        while(p1<=mid&&p2<=r)
        {
            res+=num[p1]<num[p2]?num[p1]*(r-p2+1):0;
            help[index++]=(num[p1]>num[p2]?num[p2++]:num[p1++]);
        }
        while (p1<=mid)
            help[index++]=num[p1++];
        while(p2<=r)
       help[index++]=num[p2++];
for(int i=0;i<help.length;i++)
    num[l+i]=help[i];
return res;
    }

    public static void main(String[] args) {
        int[] num={1,3,4,2,5};
        System.out.println(getSum(num));
    }
}
