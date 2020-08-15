import com.sun.deploy.security.SelectableSecurityManager;

import java.util.HashMap;

public class FindLongestSubarrayLowerthanAim {
    public static int maxLengthAwesome(int[] arr, int aim) {
        if(arr==null||arr.length==0)
            return 0;
        int length=arr.length;
        int[] sum_min=new int[length];
        int[] sum_min_Rindex=new int[length];
        sum_min[length-1]=arr[length-1];
        sum_min_Rindex[length-1]=length-1;
        for(int i=length-2;i>=0;i--)
        {
            if(sum_min[i+1]<=0) {
                sum_min[i] = arr[i] + sum_min[i + 1];
                sum_min_Rindex[i] = sum_min_Rindex[i + 1];
            }
            else{
                sum_min[i]=arr[i];
                sum_min_Rindex[i]=i;
            }
        }
        //开始遍历找最小
        int sum=0;
        int end=0;//下一个最小值。
        int len=0;
        for(int i=0;i<length;i++)
        {
            while(end<length&&sum+sum_min[end]<=aim){
                sum+=sum_min[end];
                end=sum_min_Rindex[end]+1;
            }
            sum-=end>i?arr[i]:0;//如果此时end是自己，while根本没执行（不满足小于aim）不用减了
            len=Math.max(len,end-i);
            end = Math.max(end, i + 1);
}
        return len;

    }
    public static int maxLength(int[] arr, int aim) {
        int[] h = new int[arr.length + 1];
        int sum = 0;
        h[0] = sum;
        for (int i = 0; i != arr.length; i++) {
            sum += arr[i];
            h[i + 1] = Math.max(sum, h[i]);
        }
        sum = 0;
        int res = 0;
        int pre = 0;
        int len = 0;
        for (int i = 0; i != arr.length; i++) {
            sum += arr[i];
            pre = getLessIndex(h, sum - aim);
            len = pre == -1 ? 0 : i - pre + 1;
            res = Math.max(res, len);
        }
        return res;
    }

    public static int getLessIndex(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int res = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] >= num) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }


    // for test
    public static int[] generateRandomArray(int len, int maxValue) {
        int[] res = new int[len];
        for (int i = 0; i != res.length; i++) {
            res[i] = (int) (Math.random() * maxValue) - (maxValue / 3);
        }
        return res;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            int[] arr = generateRandomArray(10, 20);
            int aim = (int) (Math.random() * 20) - 5;
            if (maxLengthAwesome(arr, aim) != maxLength(arr, aim)) {
                System.out.println("oops!");
            }
        }

    }
    }



