import java.util.LinkedList;

public class GetMaxWin {
    /**
     * 找到arr中每个固定窗口下的最大值
     * @param arr
     * @param w  ：固定的窗口大小
     * @return
     */
    public static int[] getMaxWindow(int[] arr,int w)
    {
        if(arr==null||arr.length<w||w<=1)
            return null;
        int len=arr.length-w+1;
        int[] res=new int[len];
        LinkedList<Integer> list=new LinkedList<>();
        int index=0;
        //队列窗口一直更新，但是结果数组必须在达到窗口大小之后再输入.队列里面的过期了

        //保持队列中数字从大到小
        for(int i=0;i<arr.length;i++)
        {
            while(!list.isEmpty()&&arr[i]>=arr[list.peekLast()])
            {
                list.pollLast();//弹出
            }
            list.add(i);
            if(list.peekFirst()==i-w)//i-w是最多窗口的容纳的头的序号  4321
                list.pollFirst();
            if(i>=w-1)//对于第一个第二个数字还不能确定最大，从第三个数字开始
                res[index++]=arr[list.peekFirst()];
        }
return res;

    }

    public static void main(String[] args) {
        int[] num={4,3,5,4,3,3,6,7};
        int[] res=getMaxWindow(num,3);
        System.out.println(res.length);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
}
