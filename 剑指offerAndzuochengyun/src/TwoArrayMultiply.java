public class TwoArrayMultiply {
    public int[] multiply(int[] A) {
       // 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
        //不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
        int[] B=new int[A.length];
        B[0]=1;
        for(int i=1;i<B.length;i++)//B[i]=B【i】之前的连乘
        {
            B[i]=B[i-1]*A[i-1];
        }
        int temp=1;
        for(int j=A.length-2;j>=0;j--)
        {
            temp*=A[j+1];
            B[j]*=temp;
        }
        return B;
    }
}
