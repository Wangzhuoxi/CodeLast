import java.util.Arrays;

public class maxGap
{
	public  static int maxgap(int[] nums)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
         min=Math.min(nums[i],min);
         max=Math.max(nums[i],max);
        }
        if (min == max) {
            return 0;
        }
        int len=nums.length;
        //最大值最小值以及是否有桶
        int[] maxnum=new int[len+1];
        int[] minnum=new int[len+1];
        boolean[]  hasnum=new boolean[len+1];
        int bid=0;//bucket id
        for(int i=0;i<len;i++)
        {
            bid=getBucket(nums[i],min,max,len);
            maxnum[bid]=hasnum[bid]?Math.max(nums[i],maxnum[bid]):nums[i];
            minnum[bid]=hasnum[bid]?Math.min(nums[i],minnum[bid]):nums[i];
            hasnum[bid]=true;
        }
        int gap=0;
        int last_num=maxnum[0];
        for(int i=1;i<hasnum.length;i++)
        {
            if(hasnum[i]) {
                gap = Math.max(gap, minnum[i] - last_num);
                last_num=maxnum[i];
            }

        }
return gap;
    }
    public static int getBucket(int num,int min,int max,int len)
    {
        return (num-min)*len/(max-min);
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
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }
    public static int comparator(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int gap = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            gap = Math.max(nums[i] - nums[i - 1], gap);
        }
        return gap;
    }
    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            if (maxgap(arr1) != comparator(arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }

}
