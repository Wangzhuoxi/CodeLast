package KedaxunfeiTest;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={2,2,3,4,6,1,3,1,3};
        quickSort(arr);
    }
    public static void quickSort(int[] arr){
        if(arr==null||arr.length<2)
            return;
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public static void quickSort(int[] arr,int l,int r){
        if(l<r) {
            int[] p = partition(arr, l, r);
            quickSort(arr, l, p[0] - 1);
            quickSort(arr, p[1] + 1, r);
        }
    }
    public static int[] partition(int[] arr,int l,int r){
        int less=l-1;
        int more=r+1;
        int temp=arr[r];
        //l表示cur
        while(l<more){
            if(arr[l]<temp){
                swap(arr,++less,l);
                l++;
            }
            else if(arr[l]>temp){
                swap(arr,l,--more);
                r--;
            }
            else
                l++;
        }
        return new int[]{less+1,more-1};
    }
    public static void swap(int[] arr, int l, int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
