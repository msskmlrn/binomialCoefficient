package functions;

public class MathFunctions {

	public static void main(String[] args) {
		System.out.println(c(7, 2));
		System.out.println(c(7, 0));
		System.out.println(c(7, 1));
	}

	/**
	 * This function calculates the binomial coefficient using the given numbers as parameters.
	 * n and k have to be non-negative and k <= n.
	 * @param n
	 * @param k
	 * @return the binomial coefficient
	 */
	public static int c(int n, int k) {
		return factorial(n) / (factorial(k)  * factorial(n - k));
	}

	/**
	 * This function calculates the factorial of the number given as parameter.
	 * n has to be non-negative.
	 * @param n
	 * @return the factorial
	 */
	public static int factorial(int n) {
		if (n == 0) {
			return 1; //by definition 0! == 1
		}
		else {
			return n * factorial(n - 1);
		}
	}

	//Functions that could be used to check the parameters for unusable values.

	/*
	/**
	 * This function checks the parameters before calling the function that calculates the binomial coefficient.
	 * If the parameters are unusable, the function returns -1.
	 * @param n
	 * @param k
	 */
	/*
	public static int calculateBinomialCoefficient(int n, int k) {
		if (k > n) {
			System.out.println("error, k > n. Exiting");
			return -1; //by definition, the binomial coefficient formula applies when k <= n.
		}
		else if (n < 0 || k < 0) {
			System.out.println("error, k or n was negative. Exiting");
			return -1; //by definition, the binomial coefficient formula applies when k >= 0 and n >= 0.
		}
		else {
			return c(n, k);
		}
	}
	 */

	/*
	/**
	 * This function checks the parameter before calling the the function that calculates the factorial of a given number.
	 * If the parameter is unusable, the function returns -1.
	 * @param n
	 */
	/*
	public static int calculateFactorial(int n) {
		if (n < 0) {
			System.out.println("error, n < 0. Exiting");
			return -1; //factorial of a negative integer is undefined.
		}
		else {
			return factorial(n);
		}
	}
	 */
}