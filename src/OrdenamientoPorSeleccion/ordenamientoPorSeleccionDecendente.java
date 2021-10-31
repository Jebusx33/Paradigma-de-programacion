package ordenamientoPorSeleccion;

import java.util.Arrays;

public class ordenamientoPorSeleccionDecendente {
	public static void main(String[] args) {
		java.util.Scanner lector = new java.util.Scanner(System.in);
		System.out.println("Ingresar numeros del vector separados por coma");
		String numeros = lector.nextLine();
		int[] vector = convertirListaSeparadaPorComaEnArrayDeEnteros(numeros);
		ordenarSeleccion(vector);
		System.out.println("Resultado:");
		imprimirVector(vector);
	}

	// Implementar la funcion ordenarSeleccion para que ordene en forma descendente
	static void ordenarSeleccion(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			int mayorI = i;
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[mayorI] < vector[j]) {
					mayorI = j;
				}
			}
			int aux = vector[i];
			vector[i] = vector[mayorI];
			vector[mayorI] = aux;
		}
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
