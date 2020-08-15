public class ZigZagPrint {
    public static  void   printMatrixZigZag(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = 0;
        int dC = 0;//righttop A（tR,tC） leftDown(dR,dC)
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
         boolean fromup=false;
      while(tR<=endR)//结束时上面的点的row到了最后
      {
          printZigZag(tR,tC,dR,dC,matrix,fromup);
          System.out.println("");
          tR=tC==endC?tR+1:tR;//A的点是否到达最右。后更改column
          dC=dR==endR?dC+1:dC;
          dR=dR==endR?dR:dR+1;//B是否到达最下为基准。所以row，后更改
          tC=tC==endC?tC:tC+1;

        fromup=!fromup;
      }
    }
    public static  void printZigZag(int tR,int tC,int dR,int dC,int[][] matrix,boolean fromup)
    {
        if(fromup)
        {
            while(tR<=dR)
            {
                System.out.print(matrix[tR++][tC--] + " ");
            }
        }
        else
        {
            while(tR<=dR)
            {
                System.out.print(matrix[dR--][dC++]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        printMatrixZigZag(matrix);

    }
}
