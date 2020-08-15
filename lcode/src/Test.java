
import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void insertSort(int[] arr)
    {
        int len=arr.length;
        if(len<=1)
            return;
        for(int i=1;i<=len-1;i++)
        {
            for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--) {

                    swap(arr,j,j+1);

            }
        }

return;
    }

    /**
     * 选择排序 ：类似于冒泡排序。将数字小的放在前面
     * @param arr
     */
    public static void seletionSort(int[] arr) {
     if (arr == null || arr.length < 2) {
                 return;
             }
             for (int i = 0; i < arr.length - 1; i++) {
                 int minIndex = i;
                 for (int j = i + 1; j < arr.length; j++) {
                     minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                 }
                 swap(arr, i, minIndex);
             }


    }


    public static void swap(int[] arr,int i,int j)
    {

        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }
    //归并排序：
    // 在合并的过程中会申请一个临时数组空间，然后把两个排序号的数组进行取值对比，哪个小放入到临时数组中。
    //排序一个数组，把数组从中间分为两部分，然后对前后两部分进行分别排序。最后把排序好的两部分都合并在一起，在合并的时候也会进行排序。


    /**
     * 产生长度、大小随机的数组
     * @param length
     * @param maxValue
     * @return
     */
   public static int[] generateRandomArray(int length,int maxValue)
   {
       int[] test=new int[(int) (length*Math.random())];
       for(int i=0;i<test.length;i++)
       {
           test[i]=(int)((int)(maxValue+1)*Math.random()-(int)maxValue*Math.random());
       }
       return test;

   }
   public static int[] copyArray(int[] arr)
   {
       int len=arr.length;
       int[] temp=new int[len];
       for(int i=0;i<len;i++)
       {
           temp[i]=arr[i];
       }
       return temp;

   }
   public static void printArray(int[] arr)
   {
       for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]+" ");

   }
   public static boolean equal(int[] arr1,int[] arr2)
   {
       if(arr1==null&&arr2==null)
           return true;
       if(arr1==null||arr2==null)
           return false;
       if(arr1.length!=arr2.length)
           return false;
       for(int i=0;i<arr1.length;i++)
       {
           if(arr1[i]!=arr2[i])
               return false;
       }
       return true;
   }
    public static void merge(int[] array)

    {
        if (array == null || array.length < 2) {
            return;
        }
        Merge(array, 0, array.length - 1);
    }
    public static  void Merge(int[] array,int l,int r)
    {
        if(l==r)
            return ;
        int mid = l + ((r - l) >> 1);
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

        while(p_l<=mid)
            temp[i++]=array[p_l++];
        while(p_r<=r)
        {
            temp[i++]=array[p_r++];
        }



        for(int j=0;j<temp.length;j++)
            array[l+j]=temp[j];

    }


    public static void main(String[] args) {
       int times=10000;
       boolean  res=true;
       for(int i=0;i<times;i++) {
           int[] arr1 = generateRandomArray(10, 100);
           int[] arr2 = copyArray(arr1);
          // insertSort(arr1);
         //  seletionSort(arr1);
           merge(arr1);
           Arrays.sort(arr2);
           if(!equal(arr1,arr2))

           {
               res=false;
               System.out.println("不一样");
               printArray(arr1);

               printArray(arr2);

           break;
           }

       }
        return;
    }
        }










