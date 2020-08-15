public class Code11MaxArea {
    /**
     * 利用窗口滑动找最大面积
     */
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=Integer.MIN_VALUE;
        while (l<r)
        {
            int area=(r-l)*Math.min(height[l],height[r]);
            max=Math.max(area,max);
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}
