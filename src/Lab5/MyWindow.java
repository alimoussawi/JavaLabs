package Lab5;

public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private boolean Opened;
    private String color;

    //constructor with 3 arguments
    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }


    //constructor with 2 arguments

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //constructor with 5 arguments
    public MyWindow(double width, double height, int numberOfGlass, String color, boolean Opened) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.Opened = Opened;
    }

    //constructor with 0 arguments "default constructor"

    public MyWindow() {
        this.width = 4;
        this.height = 4;
        this.color = "black";
        this.numberOfGlass = 2;
        this.Opened = true;
    }

    public void printFields() {
        System.out.format("window height:%s, width:%s, number of glass:%s, color:%s, state:%s \n", height, width, numberOfGlass, color, Opened);


    }

}