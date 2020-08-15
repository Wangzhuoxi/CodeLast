import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 打印所有的最小元素（非0），之后再减去它，再打印。循环
 * a都是正整数
 用优先级队列，如果是0，则弹出
 注意由于优先级队列无法遍历的修改，所以要用其他的方式。
 */
public class MinNoZeroElem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextByte();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        printMinNoZero(a,k);
            return;
    }
    public static void printMinNoZero(int[] a,int k)
    {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)
            queue.add(a[i]);
        int del=0;
        while(k>0)
        {
            while(!queue.isEmpty()&&queue.peek()-del==0)
                queue.poll();
            if(queue.isEmpty()){
                System.out.println(0);
                return;
            }
            else{
                int temp=queue.poll();
                temp-=del;
                System.out.println(temp);
                del+=temp;

            }
            k--;
        }
    }
    public static void printMinNoZero2(int[] a,int k)
    {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)
        {
                queue.add(a[i]);
        }
        int del=0;
        while(k>0)
        {
            while(!queue.isEmpty()&&queue.peek()-del==0)
                queue.poll();
            if(queue.isEmpty()) {
                System.out.println(0);
                return;
            }
          else {
               int x = queue.poll();
               x-=del;
                System.out.println(x);
                del+=x;
            }
          k--;
        }

    }
}
