package Lab4;

public class MatrixTask1 {
    int[][] matrix = new int[2][2];

    public int[][] MatrixAdd(int[][] a, int[][] b) {
        int sum[][] = new int[2][2];
        System.out.println("sum of 2 matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        return sum;
    }

    public  int[][] MatrixMultiply(int[][] a, int[][] b, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        System.out.println("multiplication of two matrix");
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += a[i][k] * b[k][j];

                }
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

        return product;
    }
}