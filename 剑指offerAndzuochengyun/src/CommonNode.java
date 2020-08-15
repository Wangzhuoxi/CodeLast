import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CommonNode {
    public static int n=0;
    public static int GetNumberOfK(int [] array , int k) {
        if(array.length==0)
            return 0;
        binarySearch(array,0,array.length-1,k,n);
        return n;
    }
    public static void binarySearch(int[] arr,int i,int j,int k,int n)
    {
        int mid=i+(j-i)/2;
        if(arr[mid]==k) {
            n++;
            System.out.println(n);
        }
        else if(arr[mid]>k)
        binarySearch(arr,i,mid,k,n);
        else
        binarySearch(arr,mid+1,j,k,n);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,4,5};
        System.out.println(GetNumberOfK(arr,3));

    }
}
