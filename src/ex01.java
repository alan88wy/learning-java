import java.math.*;
public class ex01 {

	enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};

	public static void main(String[] args) {
		System.out.println("Hello World!");

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println("");

		float j = 20.5f;

		System.out.println(j);

		double k = 10.0983998;

		System.out.printf("%010.4f", k);
		System.out.println("");

		System.out.println(Double.POSITIVE_INFINITY);

		System.out.println(2.0 - 1.1);
	
		char l = 'A';

		System.out.println(l);

		boolean m = true;

		System.out.println(m);

		Size s = Size.MEDIUM;

		System.out.println(s);

		System.out.println(Math.PI);

		String n = "I love Java !";

		System.out.println(n);

		// This is the right way to compare strings

		if (n.equals("I love Java !")) {
			System.out.println("Yes, I told you I love Java !");
		}

		// StringBuilder
		StringBuilder bd = new StringBuilder();

		bd.append("I ");
		bd.append("Love Java !");

		String bdString = bd.toString();

		System.out.println(bdString);

		BigInteger bi = BigInteger.valueOf(1);

		bi = bi.add(BigInteger.valueOf(100));

		bi = bi.multiply(BigInteger.valueOf(2));

		bi = bi.subtract(BigInteger.valueOf(l));

		bi = bi.divide(BigInteger.valueOf(2));

		bi = bi.mod(BigInteger.TWO);

		System.out.println(bi);

	}

}
