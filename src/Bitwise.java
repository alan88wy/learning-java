public class Bitwise {

    public static void main(String[] args) {

        int i = 2;
        int j = 3;

        System.out.println("Bitwise Operations : ");
        System.out.println("Integer " + i + " = Binary " + Integer.toBinaryString(i));
        System.out.println("Integer " + j + " = Binary " + Integer.toBinaryString(j));

        System.out.println(i + " (" + Integer.toBinaryString(i) + ") & " +
                            j + " (" + Integer.toBinaryString(j) + ") = " +
                            (i & j) + " (" + Integer.toBinaryString(i & j) + ")");
        System.out.println(i + " (" + Integer.toBinaryString(i) + ") | " +
                            j + " (" + Integer.toBinaryString(j) + ") = " +
                            (i | j) + " (" + Integer.toBinaryString(i | j) + ")");
        System.out.println(i + " (" + Integer.toBinaryString(i) + ") ^ " +
                            j + " (" + Integer.toBinaryString(j) + ") = " +
                            (i ^ j) + " (" + Integer.toBinaryString(i ^ j) + ")");

        System.out.println("~" + i + " (~" + Integer.toBinaryString(i) + ") = " + (~i) +
                            " (" + Integer.toBinaryString(~i) + ")");

        // Shift Operator
        j = i << 1;
        System.out.println("Bitwise Shift Operator");
        System.out.println(i + " << 1 (" + Integer.toBinaryString(i) + " << 1) = " + j +
                            " (" + Integer.toBinaryString(j) + ")");
        i = 13;
        j = i >> 1;
        System.out.println(i + " >> 1 (" + Integer.toBinaryString(i) + " >> 1) = " + j +
                            " (" + Integer.toBinaryString(j) + ")");

        System.out.println("Unsigned Right Shift. Similar to divide by 2");
        i = 13;
        j = i >>> 1;
        double k = i / 2.0;  // I think better to do k = (double) i / 2.0;
        System.out.println(i + " >>> 1 (" + Integer.toBinaryString(i) + " >>> 1) = " + j +
                            " (" + Integer.toBinaryString(j) + ")");

        System.out.println("Integer Division : integer i (" + i + ") / 2 = " + (i / 2));
        System.out.println("Double Division : double k = i (" + i + ") / 2.0 = " + k);

       
    }

}
