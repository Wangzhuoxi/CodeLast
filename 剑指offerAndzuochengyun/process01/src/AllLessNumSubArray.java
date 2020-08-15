import java.util.LinkedList;

public class AllLessNumSubArray {
    /**
     * 返回arr中所有的最大值减最小值小于等于num的子集
     * 用两个双向队列，一个最大一个最小，每一个L判断当前的R是否符合条件。
     * @param arr
     * @param num
     * @return
     */
    public static int getSubArrayNum(int[] arr, int num)
    {
        if(arr==null||arr.length==0)
            return 0;
        LinkedList<Integer> qmin=new LinkedList<>();
        LinkedList<Integer> qmax=new LinkedList<>();
     int i=0;
     int j=0;
int res=0;
     while(i!=arr.length)
     {
            while(j!=arr.length)
            {
                while(!qmax.isEmpty()&&arr[j]>arr[qmax.peekLast()])
            {
                qmax.pollLast();
            }
                qmax.addLast(j);
                while(!qmin.isEmpty()&&arr[j]<arr[qmin.peekLast()])
                {
                   qmin.pollLast();
                }
                qmin.addLast(j);
                if(arr[qmax.peekFirst()]-arr[qmin.peekFirst()]>num)
                {
                    break;//直接退出当前的j
                }
                j++;
            }
            if(qmin.peekFirst()==i)
                qmin.pollFirst();
         if(qmax.peekFirst()==i)
             qmax.pollFirst();

         res+=j-i;
            i++;

        }
     return res;
    }
    public static int ifSame(int[] arr,int num)
    {

       int res=0;
       for(int i=0;i<arr.length;i++)
            for(int j=i;j<arr.length;j++)
            {
                if(isValid(arr,i,j,num))
                    res++;

            }
       return res;
    }
public static boolean isValid(int[] arr,int i,int j, int num)
{
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int temp=i;temp<=j;temp++)
    {
        max=Math.max(max,arr[temp]);
        min=Math.min(min,arr[temp]);
    }
    if(max-min<=num)
        return true;
else
    return false;
}
    public static void main(String[] args) {
int[] num={2,3,5,1,5,7,8};
        System.out.println(getSubArrayNum(num,4));
        System.out.println(ifSame(num,4));
    }
}
