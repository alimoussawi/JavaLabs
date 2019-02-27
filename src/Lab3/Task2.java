package Lab3;
import java.util.Arrays;
public class Task2 {
    static int[] array = {5, 6, 2, 8, 3, 4, 9, 3, 2};
    public static void main(String[] args) {
        Arrays.sort(array);
//Arrays.binarySearch() will return the number if exist ,  - the number if it doesnt
        System.out.println(Arrays.binarySearch(array, 4));
    }
}
