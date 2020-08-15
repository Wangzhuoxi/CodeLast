package testTwice;

public class UglyNum {
    public int GetUglyNumber_Solution(int index) {
    int i2=1;
    int i3=1;
    int i5=1;
    int[] test=new int[index];
    for(int i=0;i<index;i++)
    {
        test[i]=Math.min(Math.min(2*i2,3*i3),5*i5);
        if(test[i]==2*i2)
            i2++;
        if(test[i]==3*i3)
            i3++;
        if(test[i]==5*i5)
            i5++;

    }
    return test[index-1];

    }
}
