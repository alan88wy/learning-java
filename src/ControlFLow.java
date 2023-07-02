public class ControlFLow {
    public static void main(String[] args) {
         // Final variable. Can be use in case statement in switch statement
        // if v is declare as just int v = 12, then it will give compiler error.
        // value in the case must be know at compile time.
        //
        // Also, break statement is omitted, then the next statement will also be executed
        // switch expression must be integer, string or enum
        //
        // Also switch statement is faster than if statement
        // If # of conditions is N, then if is O(n) and switch is O(1)
        // if # of conditions is > 100, use profiler eg JProfiler
        // 
        
        final int v = 12;
        int w = 12;

        switch (w) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break; // if this is omitted, then the next case 3 will also be executed if w = 2;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case v:
                System.out.println("v = " + v);
                break;
            default:
                System.out.println("Default");
                break;
        }



    }
}
