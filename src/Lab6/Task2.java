package Lab6;


import static Lab6.MyMath.FindMax;
import static Lab6.MyMath.FindMin;

public class Task2 {
    public static void main(String[] args) {
        Calculation calculation=new Calculation();
        FindMax(calculation.array1);
        FindMin(calculation.array1);
        System.out.println("-----------");
        FindMax(calculation.array2);
        FindMin(calculation.array2);


    }
}
class Calculation{
    int array1[]=new int[]{6,5,4,12};
    int array2[]=new int[]{3,25,15,63,5,1};

}