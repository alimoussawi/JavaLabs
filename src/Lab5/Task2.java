package Lab5;

public class Task2 extends Rectangle {

}

class Circle extends Shape {
    @Override
    public double calcArea(final double pi, double r) {
        double area = pi * Math.pow(r, 2);
        System.out.println("Area of circle =" + area);
        return area;
    }
}

class Rectangle extends Shape {
    @Override
    public double calcArea(double l, double w) {
        return l * w;
    }


}

class Shape {
    public double calcArea(double a, double b) {
        return a * b;
    }
}