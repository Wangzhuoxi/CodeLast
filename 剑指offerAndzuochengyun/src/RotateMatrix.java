public class RotateMatrix {
    public static void Rotate(int[][] matrix)
    {
        int tR=0;
        int tC=0;
        int dR=matrix.length-1;
        int dC=matrix.length-1;
        while(tR<=dR&&tC<=dC)
        {
            rotateEdge(tR++,dR--,tC++,dC--,matrix);

        }


    }
    public static void rotateEdge(int tR,int dR,int tC,int dC,int[][] matrix)
    {
        for(int i=0;i<dR-tR;i++)
        {
            int temp=matrix[tR][tC+i];
            matrix[tR][tC+i]=matrix[dR-i][tC];
            matrix[dR-i][tC]=matrix[dR][tC-i];
            matrix[dR][tC-i]=matrix[tR+i][dC];
            matrix[tR+i][dC]=temp;
        }
    }
}