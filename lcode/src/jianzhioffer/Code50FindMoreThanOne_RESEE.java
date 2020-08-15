package jianzhioffer;

public class Code50FindMoreThanOne_RESEE {
    /**
     * 方法四：数组里所有的数组都是0到n-1的范围内。如果数组里没有重复的数字，那么每个数字排序后的数字i都会在下标为i的位置上。由于数组中有重复的数字，那么这个位置上就会有多个数字，有些位置上也会没有数字。
     从头到尾扫描这个数组的每个数字。当到下标为i的数字时，先比较这个数字m是否等于下标i，如果等于那么就扫描下一个数字；如果不是，那它和第m个数字相比较。如果和第m个数字一样，则找到重复的数字，因为该数字在第i个位置和第m个位置都出现了；如果不是则把该第i位置上的数字和第m个位置上的数字交换，刚在它原本属于的位置上去。重复此过程，找到重复的数字。

     For example：数组{2，3，1，0，2，5，3}

     {2，3，1，0，2，5，3}第0号下标的数字是2，下标0！=2，把2和第2号下标的数字1交换

     {1，3，2，0，2，5，3}第0号下标的数字是1，下标0！=1，把1和第1号下标的数字3交换

     {3，1，2，0，2，5，3}第0号下标的数字是3，下标0！=3，把3和第3号下标的数字0交换

     {0，1，2，3，2，5，3}第0号下标的数字是0，0=0，扫描下一个数字，发现数字1，2，3和他们的下标一样。

     {0，1，2，3，2，5，3} 第4号下标的数字是2，4！=2，把2个第2号下标的数字比较，2=2，第2号下标和第4号下标的数字都是2，所以找到第一个重复的数字2，在扫描第5号下标的数字和下标一样，继续扫描，发现第6号下标的数字是3和第三号下标的数字一样，找到第二个重复的数字3，这样就把真个数组扫描完找到了重复的数字。

     * @param numbers
     * @param length
     * @param duplication
     * @return
     */
    public boolean duplicate(int numbers[],int length,int [] duplication)
        {
            boolean hasDuplicate = false;
          int i=0;
            int len=numbers.length;
            if(numbers==null||len<2)
                return false;
         while(i<len)
            {
                if(numbers[i]==i)
                    i++;
                else
                    if(numbers[numbers[i]]==numbers[i])
                    {
                        hasDuplicate=true;
                        duplication[0]=numbers[i];
                        break;
                    }
                    else
                    {
                        int m=numbers[i];
                        numbers[i]=numbers[m];
                        numbers[m]=m;
                    }

            }
            return hasDuplicate;
        }

}
