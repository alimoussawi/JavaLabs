package Lab2;

public class Task1 {
    public static void main(String[] args) {
        int[][] array=new int[10][10];
        for (int i=1;i<=9;i++){

            System.out.println("\n"+i+"|");
            for (int j=1;j<=9;j++){
                System.out.print("\t"+ j*i);
            }
        }
    }
}
