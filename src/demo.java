public class demo {
    int d = 10;
    
    static void add(int x, int y) {
        System.out.println("Adding " + x + " & " + y + " = " + (x + y));
    }

    static void printInfo() {
        System.out.println("Hello");
    }

    static void arrays() {
        int[] scores = new int[5];  // Can also declare int scores[] = new int[5]

        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 3;
        scores[3] = 4;
        scores[4] = 5;

        // Can do this too:
        // int[] scores = {1,2,3,4,5}

        System.out.println("Size of Array: " + scores.length);
        System.out.println("Printing scores array elements : ");

        for (int i : scores) {
            System.out.println(i);
        }

        scores = new int[]{9,22,34,23,12,34};  // need to do this if assigning new array

        System.out.println("Printing new scores : ");
        for (int i : scores) {
            System.out.println(i);
        }
    }

    // Method returning value
    static double multiply(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {

        demo dm = new demo();

        dm.d = 30;

        System.out.println("d : " + dm.d);

        printInfo();

        add(5, 10);

        arrays();

        System.out.println("Multiply 5 by 30 = " + multiply(5,30));

        
    }
}
