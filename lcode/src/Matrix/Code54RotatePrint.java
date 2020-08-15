package Matrix;

import java.util.ArrayList;
import java.util.List;

public class Code54RotatePrint {
    public static   List  <Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int tR=0;
        int tC=0;
        int dR=matrix.length-1;
        int dC=matrix[0].length-1;
        while(tR<=dR&&tC<=dC)
        {

            printMatrix(tC++,dC--,tR++,dR--,matrix,list);
       }
        return list;
    }
    public  static void   printMatrix(int tC,int dC,int tR,int dR,int[][] matrix,List<Integer> list)
    {
        if(tR==dR) {
            for (int i = tC; i <= dC; i++)
               list.add(matrix[dR][i]);
            return;
        }

        if(dC==tC) {
            for (int i=tR;i<=dR;i++)
                list.add(matrix[i][dC]);
            return;
        }
        for(int i=0;i<=dC-tC;i++)
        {
            list.add(matrix[tR][tC+i]);
        }
        for(int i=1;i<=dR-tR;i++)
        {
            list.add(matrix[tR+i][dC]);
        }
        for(int i=1;i<=dC-tC;i++)
            list.add(matrix[dR][dC-i]);
        for(int i=1;i<dR-tR;i++)
            list.add(matrix[dR-i][tC]);
    }

    public static void main(String[] args) {
        int[][] max={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(max));
    }
}
