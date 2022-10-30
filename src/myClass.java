import java.time.LocalDate;
import java.util.Objects;

public class myClass {
    public static void main(String[] args) {
        Employee a = new Employee("a", 1000.0, "MI6", LocalDate.now());
        Employee b = new Employee("b", 1000.0, "MI6", LocalDate.now());

        System.out.println("A : " + a.toString());
        System.out.println("B : " + b.toString());
        System.out.println("A == B ? " + a.equals(b));
        System.out.print("A hascode == b hash code ? " );
        System.out.println(a.hashCode() == b.hashCode());
        System.out.print("a.toString == b.toString ? ");
        System.out.println(a.toString() == b.toString());

        System.out.println("Setting a's name to James Bond ");

        a.setName("James Bond");

        System.out.println(a.toString());

        Employee c = new Employee();

        c.setName("Thor");
        c.setDepartment("X-Team");
        c.setSalary(0.00);
        System.out.println("C : " + c.toString());
    }
}

class Employee {
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

    public int getNextId() {
        return ++this.nextId;
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
