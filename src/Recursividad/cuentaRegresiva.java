package recursividad;

public class cuentaRegresiva {
	 public static void main(String[] args) {
		 cuentaRegresiva(5);
		 }
		 static void cuentaRegresiva(int numero) {
		 System.out.println(numero);
		 if (numero == 0) {
		 return;
		 } else {
		 cuentaRegresiva(numero-1);
		 }
		 }
}
