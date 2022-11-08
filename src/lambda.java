public class lambda {
    public static void main(String [] args) {
        Prt p = new Prt() {
            public void draw() {
                for (int i = 1; i <=10; i++) System.out.println(i);
            };
        };

        p.draw();
        
    }
}

interface Prt {
    public void draw();
}
