package Lab6;


public class MyCalc {
    public static void main(String[] args) {

        CalcPi(10);
    }

    public static double CalcPi(int n) {
        double pi = 0;
        double denominator = 1;
        for (int x = 0; x < n; x++) {
            if (x % 2 == 0) {
                pi += (1 / denominator);
            } else {
                pi -= (1 / denominator);
            }
            denominator = denominator + 2;
        }
        pi = pi * 4;
        System.out.println(pi);
        return pi;
    }


}