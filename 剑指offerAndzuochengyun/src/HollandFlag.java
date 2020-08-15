public class HollandFlag {
    public static int[] partition(int[] arr, int l, int r, int p) {
        int less = l - 1;
        int more = r + 1;
        while (l < more) {
            if (arr[l] < p) {
                swap(arr, ++less, l++);
            } else if (arr[l] > p) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        return new int[]{less+1,more-1};
    }
public static int[] flag(int[] arr,int l,int r)
{
    int less=l-1;
    int more=r+1;
    int cur=l;
    while(cur<more)
    {
        if(arr[cur]<arr[r])
            swap(arr,++less,cur++);

        else if(arr[cur]>arr[r])
          swap(arr,--more,cur);
        else
            cur++;
    }
     return new int[]{less+1,more-1};
}
public static void quickSort (int[] arr,int l,int r)
{
    if(l<r) {
        swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
        int[] last = flag(arr, l, r);
        quickSort(arr, l, last[0] - 1);
        quickSort(arr, last[1] + 1, r);
    }


}
    // for test
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // for test
    public static int[] generateArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 3);
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

    public static void main(String[] args) {
        int[] test = generateArray();
        int len=test.length;
        int[] test2=new int[len];
        printArray(test);
        for(int i=0;i<len;i++)
            test2[i]=test[i];

        int[] res = partition(test, 0, test.length - 1, 1);
      quickSort(test2,0,test2.length-1);
        printArray(test);
        printArray(test2);


    }
}
