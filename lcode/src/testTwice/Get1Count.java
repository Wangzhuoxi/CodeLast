package testTwice;

public class Get1Count {
    public int NumberOf1Between1AndN_Solution(int n) {
    int count=0;
        for(int i=1;i<=n;i++)
        count+=getCount(i);
        return count;
    }
    public int getCount(int i)
    {
        int temp=0;
        while(i!=0)
        {

            if(i%10==1)
                temp++;
            i/=10;
        }
        return temp;
    }
}
