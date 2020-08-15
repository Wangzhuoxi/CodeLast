package jianzhioffer;

public class Code51ConstruvtMulti_RESEE {
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];
        B[0]=1;
        for(int i=1;i<A.length;i++)
        {
            B[i]=B[i-1]*A[i-1];
        }
        //temp代表右半部分的基底。也就是右半部分的B[i]
        int temp=1;//B[n-1]
        for(int i=A.length-2;i>=0;i--)
        {
            temp*=A[i+1];//B[n-2]=B[n-1]*A[n-1]
           B[i]*=temp;//左×右


        }
        return B;
    }

}
