package inheritance;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private static int nextId = 0;
    private int id;
    private String name;
    private double salary;
    private String department;
    private LocalDate startDate;

    // Initialization Block
    // The initialization block runs first, and then the body of the constructor is executed.
    {
        id = ++nextId;
        startDate = LocalDate.now();
        salary = 0.00;
    }

    public Employee() {
        // Do not need to do the following since we have the initialization block below
        // this.id = this.getNextId();
        // this.salary = 0.00;
        // this.startDate = LocalDate.now();
    }

    public Employee(String name, double salary, String department, LocalDate startDate) {
        // this.id = this.getNextId();
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.startDate = startDate;
    }

    public static int getNextId() {
        return ++nextId;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", startDate=" + startDate +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
        Double.compare(employee.salary, salary) == 0 &&
        Objects.equals(name, employee.name) &&
        Objects.equals(department, employee.department);
    }
}
