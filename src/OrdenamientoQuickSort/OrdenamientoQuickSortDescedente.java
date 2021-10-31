package ordenamientoQuickSort;

import java.util.Arrays;

/*
 Ejercicio 5: Ordenamiento QuickSort Descedente

Implementar el algoritmo de ordenamiento Quick Sort para que 
ordene en forma descendente el lugar de ascendente.
Parte del programa ya se encuentra implementado, completar lo que falta

Ejemplos de salida del programa:

Ingresar numeros del vector separados por coma
1,2,3,4,5,6
Resultado
6,5,4,3,2,1

 */
public class OrdenamientoQuickSortDescedente {
	public static void main(String[] args) {
		java.util.Scanner lector = new java.util.Scanner(System.in);
		System.out.println("Ingresar numeros del vector separados por coma");
		String numeros = lector.nextLine();
		int[] vector = convertirListaSeparadaPorComaEnArrayDeEnteros(numeros);
		ordenarQuickSort(vector, 0, vector.length - 1);
		System.out.println("Resultado:");
		imprimirVector(vector);
	}

	// Implementar la funcion ordenarQuickSort para que ordene en forma descedente
	static void ordenarQuickSort(int vector[], int inicio, int fin) {
		if (inicio < fin) {
			int indiceParticion = particionar(vector, inicio, fin);
			ordenarQuickSort(vector, inicio, indiceParticion - 1);
			ordenarQuickSort(vector, indiceParticion + 1, fin);
		}
	}

	// Implementar la funcion particion que usa quickSort para que ordene en forma
	// descendente
	static int particionar(int vector[], int inicio, int fin) {
		int aux = vector[fin];
		int i = (inicio - 1);
		for (int j = inicio; j < fin; j++) {
			if (vector[j] >= aux) {
				i++;
				intercambiar(vector, i, j);
			}
		}
		intercambiar(vector, i + 1, fin);/*
		imprimirVector(vector);*/
		return i + 1;
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
