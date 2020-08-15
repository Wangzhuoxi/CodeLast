package jianzhioffer;

public class Code13ReOrderArray2 {
    public  static void reOrderArray(int [] array) {
        if(array==null||array.length==0)
            return;

        for(int i=1;i<array.length;i++)
        {
            if(array[i]%2==1)
            {
                int j=i-1;
                int temp=i;
                while(j>=0&&array[j]%2==0) {
                        swap(array,temp,j);
                        temp=j;
                        j--;
                }
            }

        }
    }
    public static void swap(int[] array,int i,int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        reOrderArray(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}

