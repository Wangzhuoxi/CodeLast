public class Test_Correct
{
    public static void merge(int[] array)

{
    if (array == null || array.length < 2) {
        return;
    }
    int l=0;
    int r=array.length-1;
    Merge(array,l,r);
}
        public static  void Merge(int[] array,int l,int r)
        {
            if(l==r)
                return ;
            int mid=(l+(r-l)/2);
            Merge(array,l,mid);
            Merge(array,mid+1,r);
            mergeSort(array,l,r,mid);

        }
        public static  void mergeSort(int[] array,int l,int r ,int mid)
        {
            int p_l=l;
            int p_r=mid+1;
            int[] temp =new int[r-l+1];
            int i=0;
            while (p_l <= mid && p_r <= r) {
                temp[i++] = array[p_l]<array[p_r]?array[p_l++]:array[p_r++];
            }

            while(p_r<=r)
            {
                temp[i++]=array[p_r++];
            }


            while(p_l<=mid)
                temp[i++]=array[p_l++];

            for(int j=0;i<temp.length;j++)
                array[j]=temp[j];

        }
}
