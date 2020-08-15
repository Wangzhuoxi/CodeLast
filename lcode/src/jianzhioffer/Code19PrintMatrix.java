package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

public class Code19PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int tR=0;
        int dR=matrix.length;
        int tC=0;
        int dC=matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>();
    while(tR<=dR&&tC<=dC)
        printEdgeMatrix(matrix,tR++,dR--,tC++,dC--,list);
 return  list;
    }
    public void printEdgeMatrix(int[][] matrix,int tR,int dR,int tC,int dC,ArrayList<Integer> list)
    {
        if(tR==dR&&tC!=dC)
        {
            for(int i=tC;i<=dC;i++)
            {
                list.add(matrix[tR][i]);
            }
        }
       else if(tR!=dR&&tC==dC)
        {
            for(int i=tR;i<=dR;i++)
            {
                list.add(matrix[i][tC]);
            }
        }
        else
        {
            for(int i=tC;i<=dC;i++)
                list.add(matrix[tR][i]);
            for(int i=tR+1;i<=dR;i++)
                list.add(matrix[i][dC]);
            for(int i=dC-1;i>=tC;i--)
                list.add(matrix[dR][i]);
            for(int i=dR-1;i>tR;i--)
                list.add(matrix[i][tC]);
        }
    }
}
