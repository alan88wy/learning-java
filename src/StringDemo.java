public class StringDemo {

    public static void main(String[] args) {
        String s = "Hello World!";

        System.out.println(s);
        System.out.println("String Length : " + s.length());
        System.out.println("s.equals(\"HELLO WORLD!\") = " + s.equals("HELLO WORLD!"));
        System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\") = " + s.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println("s.compareTo(\"HELLO WORLD!\") = " + s.compareTo("HELLO WORLD!"));
    }
}
