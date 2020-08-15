import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

public class BFPRT {


    /** getMinKthByBFPRT
     * 得到数组中最小的第k个数
     * @param arr
     * @param k
     * @return
     */
        // O(N*logK)
        // O(N)
        public static int getMinKthByBFPRT(int[] arr, int k) {
           return select(0,arr.length-1,arr,k-1);//0.。。。k-1
        }
        public  static  int select(int start,int end ,int[] arr,int k)
        {
            if(start==end)
                return arr[k];
            int media=getMediumofMedium(start,end,arr);
            int[] temp=new int[2];
            temp=partitation(arr,start,end,media);
            if(k>=temp[0]&&k<=temp[1])
                return arr[k];
            else   if(k<temp[0])
                   return select(start,temp[0]-1,arr,k);
            else
               return select(temp[1]+1,end,arr,k);

        }
        public  static int getMediumofMedium(int start,int end,int[] arr)
        {
            int num=end-start+1;
            int group=(num%5==0)?num/5:num/5+1;
            int[] mid_arr=new int[group];
            for(int i=0;i<group;i++)
            {
                int beginI=start+5*i;
                int endI=Math.min(beginI+4,end);
               mid_arr[i]= getMedium(arr,beginI,endI);//找到中位数
            }
            return select(0,mid_arr.length-1,mid_arr,mid_arr.length/2);

        }
        public static int getMedium(int[] arr,int begin,int end)
        {
            insertSort(arr,begin,end);
            int temp=begin+end;
            int mid=(temp/2)+(temp%2);

            return arr[mid];
        }
        public static void insertSort(int[] arr, int start, int end)
        {
            for(int i=start+1;i!=end+1;i++)
                for(int j=i;j!=start;j--)
                {
                    if(arr[j]<arr[j-1])
                        swap(arr,j,j-1);
                    else
                        break;
                }
        }
        public static void swap(int[] arr,int i,int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
public static int[] partitation(int[] arr, int start,int end,int media)
{
    int l=start-1;
    int r=end+1;
    int cur=start;
   while(cur!=r)
   {
       if(arr[cur]>media)
           swap(arr,--r,cur);
       else
           if(arr[cur]<media)
               swap(arr,++l,cur++);
           else
               cur++;
   }
   return new int[]{l+1,r-1};
}



        public static void main(String[] args) {
            int[] arr = { 6, 9, 1, 3, 1, 2, 2, 5, 6, 1, 3, 5, 9, 7, 2, 5, 6, 1, 9 };
            // sorted : { 1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5, 5, 6, 6, 6, 7, 9, 9, 9 }

            System.out.println(getMinKthByBFPRT(arr,10));

        }



}
