package Lab4;

public class EmployeeTask3 {
    private String name;

    public EmployeeTask3(String name, double... salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double[] getSalary() {
        return salary;
    }

    private double[] salary;

    public void calcSalary(String name, double... salary) {

        double total = 0;
        for (double a : salary) {
            total += a;
        }
        System.out.println("name: " + name + " salary:" + total);
    }

}

class Accountant {
    public static void main(String[] args) {
        double salary[] = new double[]{750, 300, 500, 1100, 220};
        EmployeeTask3 employee1 = new EmployeeTask3("MyEmployee", salary);
        employee1.calcSalary(employee1.getName(), employee1.getSalary());
    }
}