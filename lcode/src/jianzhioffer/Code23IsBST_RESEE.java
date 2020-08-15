package jianzhioffer;

public class Code23IsBST_RESEE {
    public boolean VerifySquenceOfBST(int [] sequence) {
return isBST(sequence,0,sequence.length-1);
    }
    public boolean isBST(int[] s,int start ,int end)
    {
        if(start>=end)
            return true;
        int temp=s[end];
        int i=0;
        for(;i<=end-1;i++)
        {
            if(s[i]>temp)
                break;

        }
        for(int j=i;j<=end-1;j++)
        {
            if(s[j]<temp)
                return false;
        }
       return isBST(s,start,i-1)&&isBST(s,i,end-1);
    }
}
