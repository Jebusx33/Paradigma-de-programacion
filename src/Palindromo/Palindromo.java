package palindromo;
/**
 * caso base => cuando la palabra tiene un o nigun caracter
 * caso recursivo si laprimer letra y la ultima letra son iguales y ademas el interior es un palindromo 
 * */
public class Palindromo {
	public static void main(String[] args) {
         System.out.println("rapar "+  esPalindromo("rapar"));
	
	}
	
	//recursividad
	static boolean esPalindromo(String palabra){
		//caso Base
	    if(palabra.length() <= 1) {
			return true;
		}
		
	  //caso recursivo
	    //es palindropo si la primera Y ultima Letra Son Iguales
	   boolean primeraYultimaLetraSonIguales = palabra.charAt(0) == palabra.charAt(palabra.length() -1);
        //y ademas el interior es un palindromo
	    String interior = palabra.substring(1,palabra.length() -1);
	    
	    return primeraYultimaLetraSonIguales && esPalindromo(interior); 
	}
	
	
}
