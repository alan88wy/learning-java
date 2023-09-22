import java.util.ArrayList;

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

        // Parsing Strings
        int s2i = Integer.valueOf("20");
        System.out.println("s2i (\"20\") : " + s2i);

        String data = "4004	Effective Java Programming Language Guide	2007	T	4.9";
        String[] items = data.split("\t");

        long id = Long.parseLong(items[0]);
        String title = items[1];
        // int pubYear = Integer.parseInt(items[2]);
        Integer pubYear = Integer.valueOf(items[2]);
        char genre = items[3].charAt(0);
        double rating = Double.parseDouble(items[4]);

        System.out.println("id : " + id);
        System.out.println("Title : " + title);
        System.out.println("Publication Year : " + pubYear);
        System.out.println("Genre : " + genre);
        System.out.println("Rating : " + rating);

        // Utility Methods
        System.out.println("Genre is Letter ? " + Character.isLetterOrDigit(genre));
        System.out.println("Genre is Digit ? " + Character.isDigit(genre));
        System.out.println("Genre is Letter or Digit ? " + Character.isLetterOrDigit( genre)); 
        System.out.println("Genre is UpperCase ? " + Character.isUpperCase(genre));
        System.out.println("0.0 / 0.0 is NaN : " + Double.isNaN(0.0/0.0)); 
        System.out.println("To Binary (18) : " + Integer.toBinaryString(18));
        System.out.println("To Hex (18) : " + Integer.toHexString(18));
        
        ArrayList aList = new ArrayList();
        aList.add(Long.valueOf(20));
        System.out.println(aList);
    }
}
