package Matrix;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class RESEE_Code59RotatePrint2 {
    public static  int[][] generateMatrix(int n) {

        int[][] arr = new int[n][n];
        int c = 1, j = 0;
        while (c <= n * n) {

            for (int i = j; i < n - j; i++)
                arr[j][i] = c++;
            for (int i = j + 1; i < n - j; i++)
                arr[i][n - j - 1] = c++;
            for (int i = n - j - 2; i >= j; i--)
                arr[n - j - 1][i] = c++;
            for (int i = n -j - 2; i > j; i--)
                arr[i][j] = c++;

            j++;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[][] max=generateMatrix(4);
        for(int i=0;i<max.length;i++) {
            for (int j = 0; j < max[0].length; j++) {
                System.out.print(max[i][j]);
            }
            System.out.println();
        }
    }
}
