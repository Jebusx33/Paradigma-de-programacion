package Fibonachi;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 9;
		int resultado;
		resultado = fibonacci(n); // si n es muy grande esto puede tardar bastante.
		System.out.println("\nfibonacci(" + n + ") = " + resultado);

	}
	/*
	 * static int fibo(int num) { int res; if(num==0) {
	 * 
	 * res=fibo(num-1)+fibo(num-2);
	 * 
	 * } return(res); }
	 */

	static int fibonacci(int n) {
		
		if (n == -1) {
			return -1;
		} else if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

	/*
	 * static int fibonacciFunc(int num) { if (num == 1) { return 1; } if (num == 0)
	 * { return 0; } else {
	 * 
	 * return fibonacciFunc(num - 1) + fibonacciFunc(num - 2); }
	 * 
	 * }
	 */

}
