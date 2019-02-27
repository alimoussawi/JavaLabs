package Lab3;

public class Task1 {
    public static void main(String[] args) {
        int array[][] = new int[4][4];
        int x;
        for (int i = 0; i < array.length; i++) {
            x = i + 1;
            for (int j = 0; j < array.length; j++) {
                if (j == 0) array[i][j] = i;
                else x = x + 4;
                array[i][j] = x;

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
            System.out.println("----------");
        }
    }
}
