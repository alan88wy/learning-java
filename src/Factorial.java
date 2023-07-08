public class Factorial {
    static int factorialNR(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        int fact = n;

        while (n >= 2) {
            fact = fact * (n - 1);
            n--;
        }

        return fact;
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int facNR = factorialNR(10);

        System.out.println("FactorialNR of 10 = " + facNR);

        int fac = factorial(10);

        System.out.println("Factorial of 10 = " + fac);

    }

}
