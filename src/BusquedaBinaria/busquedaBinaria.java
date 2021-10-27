package BusquedaBinaria;
/*
 * (log2)8=2^3
 * 
 * */

public class busquedaBinaria {

	public static void main(String[] args) {
		 int[] vector = new int[] {1,3,6,9,12,15,23,25};
		 int numero = 9;
		 int resultado = busquedaBinaria(vector,numero);
		 if (resultado == -1) {
		 System.out.println("No se encontro el numero en el vector");
		 } else {
		 System.out.println("Se encontro el nro en la posicion: " + resultado);
		 }
		 }
	
	static int busquedaBinaria (int[] vector, int numeroABuscar) {
		 int izquierda = 0;
		 int derecha = vector.length -1;
		 do {
			 // calcular el indice en el medio del vector
			 int medio = (izquierda+derecha)/2;
			// si el valor en el punto medio es el buscado, retornar el indice
			 if (vector[medio] == numeroABuscar) {
			 return medio;
			 }
			 // si el valor buscado se encuentra a la derecha del punto medio
			 // entonces descartar la parte izquierda
			 if (numeroABuscar > vector[medio]) {
			 izquierda = medio+1;
			 } else { // de lo contrario descartar la parte derecha
			 derecha = medio-1;
			 }
		} while (izquierda <= derecha);
		 // si se llego aquí quiere decir que no existe
		 // el valor buscado en el vector
		 return -1;
		 
		 }
	      
	
	
}