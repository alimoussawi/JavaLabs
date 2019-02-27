package Lab2;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        for (int i=2;i<=30;i++){
            if (i%2==0){
                array.add(i);
            }
        }
        System.out.println(array);
    }
}
