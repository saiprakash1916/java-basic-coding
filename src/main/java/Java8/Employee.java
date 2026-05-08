package Java8;

public class Employee {
    private String name;
    private String department;
    private double salary;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }


    public double getSalary() {
        return salary;
    }

    public Employee() {
    }

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
