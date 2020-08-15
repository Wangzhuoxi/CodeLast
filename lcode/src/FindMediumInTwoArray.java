import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class FindMediumInTwoArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

      int len=nums1.length+nums2.length;
      //偶数个找前后两个数/2
      if(len%2==0)
        return  (getkth(nums1,0,nums2,0,len/2)+getkth(nums1,0,nums2,0,len/2+1))/2.0;
    else
          return getkth(nums1,0,nums2,0,len/2+1);
    }

    /**
     *
     * @param nums1
     * @param start1
     * @param nums2
     * @param start2
     * @param k:数组的第k个数。
     * @return
     */
    private static double getkth(int[] nums1, int start1 ,int[] nums2, int start2, int k) {

        if(start1>=nums1.length)
            return nums2[start2+k-1];
        if(start2>=nums2.length)
            return nums1[start1+k-1];
        if(k==1)
            return Math.min(nums1[start1],nums2[start2]);
        int mid1=start1+k/2-1<nums1.length?nums1[start1+k/2-1]:Integer.MAX_VALUE;
        int mid2=start2+k/2-1<nums2.length?nums2[start2+k/2-1]:Integer.MAX_VALUE;
        //中位数在数组1的后部，数组2的前部
        if(mid1<mid2)
        {
            return getkth(nums1,start1+k/2,nums2,start2,k-k/2);
        }
        //中位数在2的后面
        else
         return   getkth(nums1,start1,nums2,start2+k/2,k-k/2);

}

    public static void main(String[] args) {
        int[] num1={1,2};
        int[] num2={3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
}
