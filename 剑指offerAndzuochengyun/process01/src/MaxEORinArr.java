/**
 * 返回异或和的最大值res
 */
public class MaxEORinArr {
   //前缀树
   public static class Node{
       public Node[] nexts=new Node[2];
   }

    /**
     * tree存的是1-i的eor
     */
   public static class Tree{
       public Node head=new Node();
       public void add(int num)
       {
           Node cur=head;
           for(int move=31;move>=0;move--)
           {
               int path=(num>>move)&1;
               cur.nexts[path] = cur.nexts[path] == null ? new Node() : cur.nexts[path];//看path是否存在，不存在新建，存在的话往下走
               cur = cur.nexts[path];
           }

       }

        /**
         *给定0-i的异或结果，函数存位0-0  0-i-1的异或结果，得出max
         * eor挑大的路走，走过的最大的为res
         */
       public int findMax(int num)
       {	Node cur = head;
           int res = 0;
           for (int move = 31; move >= 0; move--) {
               int path = (num >> move) & 1;//从高位到低位提取出当前是0/1
               int best = move == 31 ? path : (path ^ 1);//选择的最优的路：符号位希望0,其他希望是1，第一位和num的第一位相同，其他位相反。
               best = cur.nexts[best] != null ? best : (best ^ 1);//best路不为空选择这个路，为空的话不走
               res |= (path ^ best) << move;//每一位有了结果再做|
               cur = cur.nexts[best];
           }
           return res;

       }
   }

   public static int  maxXorSubarray(int[] arr)
   {
       if (arr == null || arr.length == 0) {
           return 0;
       }
      int eor=0;
      int max=Integer.MIN_VALUE;
      Tree tree=new Tree();
      tree.add(0);
      for(int i=0;i<arr.length;i++)
      {
          eor^=arr[i];
          max=Math.max(max,tree.findMax(eor));
          tree.add(eor);
      }
      return max;

   }
    // for test
    public static int comparator(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int eor = 0;
            for (int j = i; j < arr.length; j++) {
                eor ^= arr[j];
                max = Math.max(max, eor);
            }
        }
        return max;
    }

    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 30;
        int maxValue = 50;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            int res = maxXorSubarray(arr);
            int comp = comparator(arr);
            if (res != comp) {
                succeed = false;
                printArray(arr);
                System.out.println(res);
                System.out.println(comp);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }
}
