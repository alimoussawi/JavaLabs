package Lab4;

public class Task2 {


    public static void main(String[] args) {
        MatrixTask1 myMatrix = new MatrixTask1();
        myMatrix.matrix = new int[][]{{2, 4},{8,6}};
        myMatrix.MatrixAdd(myMatrix.matrix, myMatrix.matrix);
        myMatrix.MatrixMultiply(myMatrix.matrix, myMatrix.matrix, 2, 2, 2);
    }
}
