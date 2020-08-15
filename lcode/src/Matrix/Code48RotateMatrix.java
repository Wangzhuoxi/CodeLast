package Matrix;

public class Code48RotateMatrix {
    public static void rotate(int[][] matrix) {
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int tC = 0;
        int tR = 0;
        int dR = len1 - 1;
        int dC = len2 - 1;
while(tR<dR)
            rotateMatrix(tC++, tR++, dC--, dR--, matrix);

        return;
    }

    public static void rotateMatrix(int tC, int tR, int dC, int dR, int[][] matrix) {
       for(int i=0;i<dR-tR;i++) {
            int temp = matrix[tR][tC+i];
            matrix[tR][tC+i] = matrix[dR-i][tC];
            matrix[dR-i][tC] = matrix[dR][dC-i];
            matrix[dR][dC-i] = matrix[tR+i][dC];
            matrix[tR+i][dC] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotate(matrix);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
