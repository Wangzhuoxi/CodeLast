package testTwice;

public class mutiply {
    public int[] multiply(int[] A) {
    int []B=new int[A.length];
    B[0]=1;
    int n=A.length;
    for(int i=1;i<n;i++)
        B[i]=B[i-1]*A[i-1];
    int temp=0;
    for(int i=n-2;i>=0;i--)
    {
        temp*=A[i+1];
        B[i]*=temp;
    }
    return B;
    }
}
