package Lab6;

import java.util.Arrays;

public class MyMath {
     final static double pi =3.14;

    public static int FindMin(int [] array ){
        Arrays.sort(array);
        int min=array[0];
        System.out.println(" min is : "+min);
    return min;}

    public static int FindMax(int []array){
        Arrays.sort(array);
        int max=array[array.length-1];
        System.out.println("max is : "+max );
    return max;}
    public static void AreaOfCircle(double radius){
        double area =pi*(radius*radius);
        System.out.println("circle Area:"+area);
    }
}
