public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        // Random - generate between 0 and 1
        int random = (int) (Math.random() * 100) + 1;

        System.out.println("Winner : " + random);

        // Rounding
        System.out.println("Round 24.45 : " + Math.round(24.45));
        System.out.println("Round 24.45f : " + Math.round(24.45f));

        // Round Up
        System.out.println("Ceil 24.45 : " + Math.ceil(24.45));
        System.out.println("Ceil 25.0 : " + Math.ceil(25.0));

        // Min-Max
        System.out.println("Max (24.45, 24.5) : " + Math.max(24.45, 24.5));

        // abs
        System.out.println("Abs (-24.45) : " + Math.abs(-24.45));

        // Power
        System.out.println("3 to the Power of 2 : " + Math.pow(3, 2));

        // Sqrt
        System.out.println("Square Root of 3 : " + Math.sqrt(3));

        // Log 10 base e
        System.out.println("Log 10 base e: " + Math.log(10));

        // Log 10 base 10
        System.out.println("Log 10 base 10: " + Math.log10(10));

        // Log 10 base 10
        /*  Returns the natural logarithm of the sum of the argument and 1. Note that for 
            small values x, the result of log1p(x) is much closer to the true result of ln(1 + x) 
            than the floating-point evaluation of log(1.0+x)
        */
        System.out.println("log1p(10) : " + Math.log1p(10));
    }
}
