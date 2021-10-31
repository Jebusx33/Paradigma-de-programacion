package busquedaSecuencial;

public class busquedaSecuencial {

	public static void main(String[] args) {
		int[] vector= new int[] { 1, 3, 5, 9, 15, 18, 25}; 
			buscar(vector, 0, vector.length-1, 3);
	      
		
	}
		 static int buscar(int[] vector, int inicio, int fin, int numeroABuscar ) {
		inicio = vector[0];
		fin = vector[6];
		      numeroABuscar=23;
		      boolean numeroEncontrado=false;
		      if (numeroEncontrado) {
				
			}else {
			 for (int i = 0; i < vector.length; i++) {
			if (numeroABuscar == vector[i]) {
				numeroEncontrado=true;
				System.out.println("Posicion: " + i + " valor: " + vector[i]);
			}
			
			}
			
			 }
				System.out.println("numero no encontrado");
				 return -1;
		 }
}
