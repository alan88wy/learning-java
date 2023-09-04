import java.util.*;

public class JavaCollections {

    public static void gen() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        for (int m: map.keySet()) {
            System.out.println(map.get(m).toString());
        }

        Vector<String> vector = new Vector<String>();
        vector.add("d");
        vector.add("e");
        vector.add("f");

        for (int i=0; i<vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        Stack<String> stack = new Stack<String>();
        // Stack<Integer> stack = new Stack<Integer>();

        stack.push("i");
        stack.push("h");
        stack.push("g");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
      
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        BitSet bitSet = new BitSet();
        // Enumeration<Integer> enumeration = new Enumeration<Integer>();
        
    }

    public static void JavaList() {

        ArrayList<String> arList = new ArrayList<String>();
        arList.add("a");
        arList.add("b");
        arList.add("c");

        System.out.println("ArrayList : ");
        System.out.println("arList.isEmpty() : " + arList.isEmpty());
        System.out.println("Array List : " + arList);
        System.out.println("arList.size() : " + arList.size());
        System.out.print("Iterating Array List elements : ");
        
        Iterator<String> ar = arList.iterator();
        
        while (ar.hasNext()) {
            System.out.print(ar.next() + " ");
        }

        System.out.println();
        System.out.println("arList.contains(\"a\") : " + arList.contains("a"));
        System.out.println("arList.get(1) : " + arList.get(1));
        System.out.println("arList.subList(1,3) : " + arList.subList(1,3));
        arList.set(1, "B");
        System.out.println("arList.set(1, \"B\") : " + arList);
        arList.remove(1);
        System.out.println("arList.remove(1) : " + arList);
        arList.clear();
        System.out.println("arList.clear() : " + arList);

        LinkedList<String> linkList = new LinkedList<String>();

        linkList.add("A");
        linkList.add("B");
        linkList.add("C");

        System.out.println("\nLinkList");
        System.out.println("linkList.isEmpty() : " + linkList.isEmpty());
        System.out.println("Link List : " + linkList);
        System.out.println("linkList.size() : " + linkList.size());
        System.out.print("Iterating Array List elements : ");
        
        Iterator<String> ll = linkList.iterator();
        
        while (ll.hasNext()) {
            System.out.print(ll.next() + " ");
        }

        System.out.println();
        System.out.println("linkList.contains(\"A\") : " + linkList.contains("A"));
        linkList.addFirst("0");
        System.out.println("linkList.addFirst(\"0\") : " + linkList);
        linkList.addLast("Z");
        System.out.println("linkList.addLast(\"Z\") : " + linkList);
        System.out.println("linkList.get(1) : " + linkList.get(1));
        System.out.println("linkList.getFirst()) : " + linkList.getFirst());
        System.out.println("linkList.getLast()) : " + linkList.getLast());
        System.out.println("linkList.subList(1,3) : " + linkList.subList(1,3));
        linkList.set(1, "b");
        System.out.println("linkList.set(1, \"b\") : " + linkList);
        System.out.println("linkList.pop() : " + linkList.pop());
        linkList.push("U");
        System.out.println("linkList.push(\"U\") : " + linkList);
        linkList.remove(1);
        System.out.println("linkList.remove(1) : " + linkList);
        linkList.removeFirst();
        System.out.println("linkList.removeFirst() : " + linkList);
        linkList.removeLast();
        System.out.println("linkList.removeLast() : " + linkList);
        linkList.clear();
        System.out.println("linkList.clear() : " + linkList);

    }

    public static void JavaVector() {
        Vector<Integer> vector = new Vector<Integer>();

        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("\nVector");
        System.out.println("vector.isEmpty() : " + vector.isEmpty());
        System.out.println("Vector : " + vector);
        System.out.println("vector.size() : " + vector.size());
        System.out.print("Iterating vector elements : ");

        Iterator<Integer> vec = vector.iterator();

        while (vec.hasNext()) {
            System.out.print(vec.next() + " ");
        }

        System.out.println();
        System.out.println("vector.contains(\"A\") : " + vector.contains("A"));
        vector.add(0, 0);
        System.out.println("vector.add(0, 0) : " + vector);
        vector.addElement(12);
        System.out.println("vector.addElement(12) : " + vector);
        System.out.println("vector.get(1) : " + vector.get(1));
        vector.set(1, 10);
        System.out.println("vector.set(1, 10) : " + vector);
        System.out.println("vector.subList(1,3) : " + vector.subList(1,3));
        vector.remove(1);
        System.out.println("vector.remove(1) : " + vector);
        vector.clear();
        System.out.println("vector.clear() : " + vector);
        
    }

    public static void JavaStack() {

        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("\nStack: ");

        System.out.println("Stack Capacity : " + stack.capacity());
        System.out.println("stack.isEmpty() : " + stack.isEmpty());
        System.out.println("stack : " + stack);
        System.out.println("stack.size() : " + stack.size());
        System.out.print("Iterating stack elements : ");
        Iterator<Integer> si = stack.iterator();

        while (si.hasNext()) {
            System.out.print(si.next() + " ");
        }

        System.out.println();
        System.out.println("stack.contains(1) : " + stack.contains(1));
        stack.add(0, 0);
        System.out.println("stack.add(0, 0) : " + stack);
        stack.addElement(12);
        System.out.println("stack.addElement(12) : " + stack);
        System.out.println("stack.get(1) : " + stack.get(1));
        stack.set(1, 10);
        System.out.println("stack.set(1, 10) : " + stack);
        System.out.println("stack.subList(1,3) : " + stack.subList(1,3));
        stack.remove(1);
        System.out.println("stack.remove(1) : " + stack);
        stack.removeElementAt(2);
        System.out.println("stack.removeElementAt(2) : " + stack);
        System.out.println("\nStack Popping :");
        System.out.println("stack.pop() : " + stack.pop());
        System.out.println("stack.pop() : " + stack.pop());
        System.out.println("stack.pop() : " + stack.pop());
        stack.clear();
        System.out.println("stack.clear() : " + stack);
    }

    public static void JavaQueuing() {

        System.out.println("\nPriority Queue :");

        Queue<String> q1 = new PriorityQueue<String>();

        q1.add("a");
        q1.add("b");
        q1.add("c");

        System.out.println("q1.size() : " + q1.size());
        System.out.println("q1.isEmpty() : " + q1.isEmpty());
        System.out.println("q1 : " + q1);
 
        System.out.print("Iterating queue elements : ");
        Iterator<String> qe1 = q1.iterator();

        while (qe1.hasNext()) {
            System.out.print(qe1.next() + " ");
        }

        System.out.println();

        System.out.println("vector.q1(\"A\") : " + q1.contains("A"));
        q1.add("d");
        System.out.println("q1.add(\"d\") : " + q1);
        

        System.out.println("\nArray DeQue :");
        
        
        Queue<String> q2 = new ArrayDeque<String>();

    }
    public static void main(String[] args) {
        // JavaList();
        // JavaVector();
        // JavaStack();
        JavaQueuing();
    }
}
