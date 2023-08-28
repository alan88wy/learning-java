import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InitializationBlock {

    static HashMap<String, Integer> map = new HashMap<String, Integer>();

    static {
        map.put("John", 1234);
        map.put("Sally", 4323);
    }
    
    public InitializationBlock(String name, Integer value) {
        System.out.println("Inside InitializationBlock constructor with two arguments: " + name + " & " + value );
    }

    public InitializationBlock() {
        System.out.println("Inside InitializationBlock constructor with no arguments");
    }

    {
        // Instance Initialization
        System.out.println("Inside Instance Initialization block");
    }
    public static void main(String[] args) {
        System.out.println(map);
        System.out.println("map.get(\"John\") = " + map.get("John"));
        System.out.println("map.get(\"Sally\") = " + map.get("Sally"));
        System.out.println("map.put(\"Steven\", 98700)");
        map.put("Steven", 98700);
        System.out.println(map);

        InitializationBlock ib = new InitializationBlock();
        InitializationBlock ib2 = new InitializationBlock("James", 1234);

        // Synchronizing the map
        Map<String, Integer> sMap = Collections.synchronizedMap(map);

        // printing the Collection
        System.out.println("Synchronized map is : " + sMap);

        final ArrayList <Integer> d = new ArrayList<>();

        d.add(1);
        d.add(2);
        d.add(3);

        for (int k : d) {
            System.out.print(k + " ");
        }




    }

    private static void foreach(Class<Integer> class1) {
    }
}
