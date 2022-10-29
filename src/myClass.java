import java.time.LocalDate;
import java.util.Objects;

public class myClass {
    public static void main(String[] args) {
        Employee a = new Employee(123, "a", 1000.0, "MI6", LocalDate.now());

        a.setName("James Bond");
        
        System.out.println(a.toString());

    }
}

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private LocalDate startDate;

    public Employee(int id, String name, double salary, String department, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.startDate = startDate;
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
