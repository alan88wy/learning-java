import java.util.*;

public class array {
    public static void main(String[] args) {
        int[] a = new int[100];

        for (int i = 0; i < 100; i++) {
            a[i] = i;
        }

        // copy array

        int[] b = Arrays.copyOf(a, a.length);

        for (int i : b) {
            System.out.print(i + " " );
        }


    }
}
