import java.util.*;

public class scanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            System.out.println(i);
        };

        sc.close();

        

    }
}
