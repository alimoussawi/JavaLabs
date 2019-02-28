package Lab6;

public class MyPyramid {
    public static void main(String[] args) {
        printPyramid(8);
    }

    public static void printPyramid(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = h - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j == i && j != 1) {
                    for (int k = j - 1; k >= 1; k--) {
                        System.out.print(k);
                    }
                }

            }
            System.out.println();
        }

    }
}