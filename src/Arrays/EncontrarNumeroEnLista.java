package Arrays;

public class EncontrarNumeroEnLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner lector = new java.util.Scanner(System.in);
		int[] numeros = new int[] {1,5,6,23,54,65,1};
		 int numeroABuscar = 6;
		 boolean numeroEncontrado = false;
		 for (int i=0; i<numeros.length; i++) {
		 if (numeros[i] == numeroABuscar) {
		 numeroEncontrado = true;
		 }
		 }
		 System.out.println("numero encontrado: " + numeroEncontrado);
		 
	}

}
