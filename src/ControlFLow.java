import java.util.*;
public class ControlFLow {
    public static void main(String[] args) {
         // Final variable. Can be use in case statement in switch statement
        // if v is declare as just int v = 12, then it will give compiler error.
        // value in the case must be know at compile time.
        //
        // Also, break statement is omitted, then the next statement will also be executed
        // switch expression must be integer, string or enum
        //
        // Also switch statement is faster than if statement
        // If # of conditions is N, then if is O(n) and switch is O(1)
        // if # of conditions is > 100, use profiler eg JProfiler
        // 
        
        final int v = 12;
        int w = 12;

        switch (w) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break; // if this is omitted, then the next case 3 will also be executed if w = 2;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case v:
                System.out.println("v = " + v);
                break;
            default:
                System.out.println("Default");
                break;
        }

        // Ternary operator

        // String result = (v >= 12) ? ((v == 12) ? "= 12" :  "> 12"): "<= 12";

        // System.out.println(result);

        // System.out.println("");

        int[] array = {0,1,2,3,4,5,6,7,8,9, 10, 11};

        System.out.print("Printing array : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // Using another method

        System.out.print("Printing array using for each: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // swapping element
        for (int i=0, j=array.length-1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.print("Reversed array : ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // Can do this too

        System.out.print("Reverse array again : ");

        for (int i=0, j=array.length-1, middle = array.length/2; i < middle; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // In order for the following to work, we need to declare using Integer[] instead of int[]
        //

        Integer[] array2 = {0,1,2,3,4,5,6,7,8,9};

        
        System.out.println("\nReverse array using Collections.reverse : \n");

        Collections.reverse(Arrays.asList(array2));
        System.out.println("Reversed Array: " + Arrays.asList(array2));

        System.out.print("Printing array : ");

        for (int i : array2) {
            System.out.print(i + " ");
        }

        System.out.println("");

    }
}
