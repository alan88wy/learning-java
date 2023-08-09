public class StringDemo {

    public static void main(String[] args) {
        String s = "Hello World!";

        System.out.println("s = " + s);
        System.out.println("s.length() = " + s.length());
        System.out.println("s.equals(\"HELLO WORLD!\") = " + s.equals("HELLO WORLD!"));
        System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\") = " + s.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println("s.compareTo(\"HELLO WORLD!\") = " + s.compareTo("HELLO WORLD!"));
        System.out.println("s.charAt(1) == (\"HELLO WORLD!\".charAt(1)) = " + (s.charAt(1) == "HELLO WORLD!".charAt(1)));
        System.out.println("s.endsWith(\"!\") = " + s.endsWith("!"));
        System.out.println("\" HELLO WORLD! \".strip() Strip leading and ending spaces= \"" + " HELLO WORLD! ".strip() + "\"");
        System.out.println("\"HELLO WORLD!\".toLowerCase() To Lower Case =  \"" + "HELLO WORLD!".toLowerCase() + "\"");
        System.out.println("\"Hello World!\".toUpperCase() To Upper Case =  \"" + "Hello World!".toUpperCase() + "\"");
        System.out.println("s.join(\"-\", \"HELLO\", \"WORLD\",\"!\") = " + s.join("-", "HELLO", "WORLD", "!"));
        
        String t[] = "I See a Fox Jumping Over The Fence !".split(" ");

        System.out.println("\"I See a Fox Jumping Over The Fence !\".split() : ");
        for (String a: t) {
            System.out.print(a + " > ");
        }

        System.out.println("");

    }
}
