import java.time.LocalDate;

public class date {
    public static void main(String[] args) {
        LocalDate a = LocalDate.now().plusMonths(2);

        System.out.println(a);

        System.out.println("Year : " + a.getYear());
        System.out.println("Month : " + a.getMonth());
        System.out.println("Month (Int) " + a.getMonthValue());
        System.out.println("Day : " + a.getDayOfMonth());



    }
}
