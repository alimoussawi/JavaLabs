package Lab2;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
         ArrayList<Integer> array=new ArrayList<>();
        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0||i%4==0){
                array.add(i);

            }
            if (array.size()==10)break;
        }
        System.out.println(array);
    }
}
