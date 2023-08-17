
public class StringDemo {

    static void stringPool() {

        /* 
            String Pool
            ***********

            The JVM can optimize the amount of memory allocated for them by storing only one copy of each literal
            String in the pool. This process is called interning.

            When we create a String variable and assign a value to it, the JVM searches the pool for a String of
            equal value.

            If found, the Java compiler will simply return a reference to its memory address, without allocating
            additional memory.

            When we create a String via the new operator, the Java compiler will create a new object and store it
            in the heap space reserved for the JVM.

            Every String created like this will point to a different memory region with its own address.

            We can manually intern a String in the Java String Pool by calling the intern() method on the object
            we want to intern.

            Manually interning the String will store its reference in the pool, and the JVM will return this
            reference when needed.

         */


        System.out.println("\nInside stringPool ...\n");
        String s1 = "hello!";
        String s2 = "hello!";               // Will point to the same address of s1
        String s3 = "hello!".intern();      // Will point to the same address of S1
        String s4 = new String("hello!");   // This will point to a new string object in the heap which will 
                                            // point to the same address of s1 but it is not the same as s1 unless you
                                            // refer to the value using the intern() method
        String s5 = "lo!";

        System.out.println("String s1 = \"hello!\";");
        System.out.println("String s2 = \"hello!\";");
        System.out.println("String s3 = \"hello!\".intern();");
        System.out.println("String s4 = new String(\"hello!\");");
        System.out.println("String s5 = \"lo!\";\n");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));
        System.out.println("s1 == s4.intern(): " + (s1 == s4.intern()));
        System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));
        System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5));

       

    }

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

        stringPool();

         // StringBuffer()
        StringBuffer sb1 = new StringBuffer("Hello World!");
        sb1 = sb1.append(" Good Morning!");

        System.out.println(sb1);
        sb1.insert(0, "Ha ha ha ! ");
        System.out.println(sb1);
        sb1.replace(0, 11, "");
        System.out.println(sb1);
        sb1.delete(0, 13);
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
    }
}
