package Lab5;

public class Task7 {
    public static void main(String[] args) {
        MyWindow[] array = new MyWindow[4];
        array[0] = new MyWindow(2, 4, 2, "blue", false);
        array[1] = new MyWindow(2, 2);
        array[2] = new MyWindow(3, 3, 3);
        array[3] = new MyWindow();
        for (MyWindow myWindow : array) {

            myWindow.printFields();
        }

    }
}
