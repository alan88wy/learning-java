public class BoxPrimitives {

    public static void main(String[] args) {

        // Boxed Primitives

        Integer in = Integer.valueOf(2);  // static factory method
        Boolean bl = Boolean.valueOf(true); // static factory method
        Double db = Double.valueOf(23.5);
        Character ch = Character.valueOf('c');

        System.out.println("in = " + in + ", b1 = " + bl + ", db = " + db + ", ch = " + ch);

        System.out.println("in.compareTo(2) : " + (in.compareTo(2) == 0 ? true : false));

        System.out.println("in == 2 : " + (in == 2));
        
    }
}
