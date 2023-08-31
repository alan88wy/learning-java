public class BoxPrimitives {

    public static void main(String[] args) {

        // Boxed Primitives

        Integer in = Integer.valueOf(2);  // static factory method
        Boolean bl = Boolean.valueOf(true); // static factory method
        Double db = Double.valueOf(23.5);
        Character ch = Character.valueOf('c');

        System.out.println(in + " " + bl + " " + db + " " + ch);
    }
}
