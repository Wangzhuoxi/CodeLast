package jianzhioffer;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Code63FindStringPath {
    /**
     * 思路：先找到第一字符的位置，之后回溯法找。如果此时已经index已经等于字符串的length，则说明找完了，返回true。如果越界，或者遍历到的字符为访问过的，
     * 或者是未访问过并且不符合条件的，则return false
     * @param matrix：以一维数组表示的二维数组
     * @param rows：给定的rows
     * @param cols
     * @param str
     * @return
     */
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    { if (matrix == null || str == null || matrix.length == 0 || str.length == 0)
    {
        return false;
    }
        boolean[] flags=new boolean[matrix.length];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r * cols + c] == str[0]) {// 找到字符串的首字符（很可能不止一
                    if (findPath(matrix, rows, cols, str,r, c,  0, flags)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    /**
     *
     * @param matrix
     * @param rows：总共的行数
     * @param cols：总共的列数
     * @param str:要凑齐的str
     * @param r：当前行数
     * @param c：当前列数
     * @param i：当前的str的index
     * @param flag
     * @return
     */
    public boolean findPath(char[] matrix, int rows, int cols, char[] str,int r,int c,int i,boolean[] flag)
    {
        if(i== str.length)
            return true;
        if(r<0||r>=rows||c<0||cols<=c)
            return false;
        if(flag[r*cols+c]==true||(flag[r*cols+c]==false&&matrix[r*cols+c]!=str[i]))
            return false;
        flag[r*cols+c]=true;
        boolean res=findPath(matrix,rows,cols,str,r+1,c,i+1,flag)||findPath(matrix,rows,cols,str,r-1,c,i+1,flag)
                ||findPath(matrix,rows,cols,str,r,c+1,i+1,flag)||findPath(matrix,rows,cols,str,r,c-1,i+1,flag);
        if(res==true)
            return res;
        else
        { flag[r*cols+c]=false;

            return false;
        }

    }
}