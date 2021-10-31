package factorialRecursivo;
/*
 * factorial = n*(n-1)
 */
public class factorialRecursivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println( factorial(4)); 
	}

	static int factorial(int n) {
		
		if (n>=1) {
			return n*factorial(n-1);
		}else{
			return 1;
		}
	}
	
}
