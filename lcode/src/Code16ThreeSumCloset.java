import java.util.Arrays;

public class Code16ThreeSumCloset {
    public static  int threeSumClosest(int[] nums, int target) {

        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k]==target)
                    return target;
               else if(j<k&&nums[i]+nums[j]+nums[k]>target)
                {
                    if(Math.abs(nums[i]+nums[j]+nums[k]-target)<Math.abs(min-target))
                     min=nums[i]+nums[j]+nums[k];
                    while(j<k&&nums[k]==nums[k-1])
                    {k--;}
                    k--;

                }
                else
                {
                        if(Math.abs(nums[i]+nums[j]+nums[k]-target)<Math.abs(min-target))
                            min=nums[i]+nums[j]+nums[k];
                        while(j<k&&nums[j]==nums[j+1])
                            j++;
                        j++;
                    }
                }



        }
return min;
    }

    public static void main(String[] args) {
       int[] nums={-3,-2,-5,3,4};
        System.out.println(  threeSumClosest(nums,-1));
    }
}
