package inheritance;
import java.time.LocalDate;

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

