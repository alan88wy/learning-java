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
        
        System.out.println(" ~ " + i + " (~" + Integer.toBinaryString(i) + ") = " + (~i) +
                            " (" + Integer.toBinaryString(~i) + ")");
        
        
        
    }

}
