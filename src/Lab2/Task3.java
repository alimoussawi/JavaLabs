package Lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number");
        int x=input.nextInt();
        int sum=0;
        int average=0;
        for (int i=1;i<=x;i++){
            sum+=i;
            average=sum/i;
        }
        System.out.println("sum of number is : "+sum);
        System.out.println("average is : "+average);
    }
}
