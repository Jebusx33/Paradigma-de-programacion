package OrdenarmientoPorInsercion;

/*
  
 */
import java.util.Arrays;

public class ordenamientoPorInsercionDecendente {

	public static void main(String[] args) {
		java.util.Scanner lector = new java.util.Scanner(System.in);
		System.out.println("Ingresar numeros del vector separados por coma");
		String numeros = lector.nextLine();
		int[] vector = convertirListaSeparadaPorComaEnArrayDeEnteros(numeros);
		ordenarInsercion(vector);
		System.out.println("Resultado:");
		imprimirVector(vector);
	}

	// Implementar la funcion ordenarInsercion para que ordene en forma descedente
	static void ordenarInsercion(int[] vector) {
		for (int i = 1; i < vector.length; i++) {
			int matrizAux = vector[i];
			int aux = i - 1;
			while (aux >= 0 && vector[aux] < matrizAux) {
				vector[aux + 1] = vector[aux];
				aux--;
			}
			vector[aux + 1] = matrizAux;
		}
		/*
		 * for (int i = 1; i < vector.length; i++) { // Guardar el elemento a analizar
		 * int matrizAux = vector[i]; // Mover la variable j al elemento a la izquierda
		 * de la clave int j = i - 1; // Mover los elementos que son mas grandes que la
		 * clave a la derecha while (j >= 0 && vector[j] < matrizAux ) { vector[j + 1] =
		 * vector[j]; j = j - 1; } // Insertar el valor guardado en el lugar libre
		 * vector[j + 1] = matrizAux ; }
		 */
	}

	static int[] convertirListaSeparadaPorComaEnArrayDeEnteros(String lista) {
		int[] numeros = Arrays.asList(lista.split(",")).stream().map(String::trim).mapToInt(Integer::parseInt)
				.toArray();
		return numeros;
	}

	static void imprimirVector(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	static void intercambiar(int[] array, int a, int b) {
		int valor = array[b];
		array[b] = array[a];
		array[a] = valor;
	}

}
