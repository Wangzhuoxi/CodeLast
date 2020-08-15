package jianzhioffer;

public class Code64MovingCount {

    public int movingCount(int threshold, int rows, int cols)
    {
        if(threshold<=0)
            return 0;
        boolean [][]flags=new boolean[rows][cols];
        return getCount(threshold,rows,cols,0,0,flags);

    }

    public int getCount(int k,int row,int col,int r,int c,boolean[][] flag) {
        if(r>=row||c>=col||r<0||c<0)
            return 0;
        if(flag[r][c]==true|| isLargeThanK(r,c,k))
            return 0;
        flag[r][c]=true;
        return 1+getCount(k,row,col,r+1,c,flag)+getCount(k,row,col,r,c+1,flag)+getCount(k,row,col,r,c-1,flag)+getCount(k,row,col,r-1,c,flag);
    }
    boolean isLargeThanK(int r,int c,int k)
    {
        int  count=0;
        while(r!=0)
        {
            count+=r%10;
            r=r/10;
        }
        while(c!=0)
        {
            count+=c%10;
            c=c/10;
        }
        if(count>k)
            return true;
        else
            return false;
        }
    }


