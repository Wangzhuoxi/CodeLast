public class findNum {
    public static boolean isContainNum(int[][] matrix,int num)
    {
        int len=matrix[0].length-1;
        int row=0;
       while(row<=matrix.length&&len>=0)
        {
           if(matrix[row][len]==num)
               return true;
           else if(matrix[row][len]>num)
               len--;
            else
                    row++;

        }
       return false;
    }
}
