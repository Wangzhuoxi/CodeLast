package testTwice;
//在一个长度为n的数组里的所有数字都在0到n-1的范围内
public class FindTwice {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||numbers.length<=1)
            return false;
        boolean hasTwice=false;
    //让数组归位
        int i=0;
       while(i<length){
           //数组已经归为
            if(numbers[i]==i)
                i++;
            //想往回换发现已经被占了。（已经存在一个了）
            //numbers[i]不等于i.要让numsbers[i]=i.先让numbers[i]这个值去找numsbers[numbers[i]]换。发现别人正合适，就说明冲突了
         else  if(numbers[numbers[i]]==numbers[i])
           {
               hasTwice=true;
               duplication[0]=numbers[i];
                    return hasTwice;
                }
                else
                {
                    int m=numbers[i];
                 numbers[i]=numbers[m];
                    numbers[m]=m;
                }


        }
        return hasTwice;
    }
}
