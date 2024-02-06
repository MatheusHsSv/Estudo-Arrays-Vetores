package ListEntities;

public class Employees {

    private String name;
    private int id;
    private double salary;

    public Employees(String name, int id, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        salary += salary * percentage / 100.0;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}
