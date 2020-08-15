public class NoSignalAdd {
    public int Add(int num1,int num2) {
        while(num2!=0)
        {
            int temp=num1^num2;//h获得散位，也就是不一样的，不需要进位的
            num2=(num1&num2)<<1;//需要进位的
            num1=temp;
        }
        return num1;

    }
}
