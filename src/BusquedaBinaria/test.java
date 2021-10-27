package BusquedaBinaria;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
	}

	static void ordenarPorInsercion(int[] vector) {
		  for (int i = 1; i < vector.length; i++) {
		    // Guardar el elemento a analizar
		    int valor = vector[i];
		    // Guardar el indice donde queda el agujero
		    int indiceAgujero = i;
		    // Mover los elementos de la parte ordenada más grandes 
		    // que el valor guardado un lugar a la derecha
		    while (indiceAgujero > 0 && valor < vector[indiceAgujero - 1]) {
		      vector[indiceAgujero] = vector[indiceAgujero - 1];
		      indiceAgujero = indiceAgujero - 1;
		    }
		    // Insertar el valor guardado en el lugar libre
		    vector[indiceAgujero] = valor;
		  }
		}
}
