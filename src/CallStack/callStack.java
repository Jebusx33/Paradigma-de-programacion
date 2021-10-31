package callStack;

public class callStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumarDos(5));
	}
	static int sumarDos(int numero) {
		 int resultado = 0;
		 resultado = sumarUno(numero);
		 resultado = sumarUno(resultado);
		 return resultado;
		 }
		 static int sumarUno(int numero) {
		 int resultado = numero + 1;
		 return resultado;
		 }

}
