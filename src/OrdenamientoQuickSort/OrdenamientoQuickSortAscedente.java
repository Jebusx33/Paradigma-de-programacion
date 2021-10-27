package OrdenamientoQuickSort;

public class OrdenamientoQuickSortAscedente {
	 public static void main(String[] args) {
		    int[] vector = new int[] { 7, 4, 5, 9, 8, 2, 1 };
		    imprimirVector(vector);
		    quickSort(vector, 0, vector.length - 1);
		  }
		  static void quickSort(int vector[], int inicio, int fin) {
		    if (inicio < fin) {
		      // llamar a particionar que devuelve el indice del pivote ordenado
		      int indiceParticion = particionar(vector, inicio, fin);
		      // llamar quickSort con la sublista izquierda
		      quickSort(vector, inicio, indiceParticion - 1);
		      // llamar a quickSort con la sublista derecha
		      quickSort(vector, indiceParticion + 1, fin);
		    }
		  }
		  // Este metodo coloca los elementos menores que el pivote a la izquierda y
		  // los mayores a su derecha en la sublista que comienza en inicio
		  // y finaliza en fin
		  static int particionar(int vector[], int inicio, int fin) {
		    // elemento a ser ubicado en la posición correcta
		    int pivote = vector[fin];
		    // indice del ultimo elemento menor que el pivote insertado
		    int i = (inicio - 1);
		    for (int j = inicio; j < fin; j++) {
		      // si el elemento actual es menor que el pivote
		      if (vector[j] <= pivote) {
		        // incrementar indice del ultimo elemento menor que el pivote       
		        i++;
		        // intercambiar el valor actual con el elemento a la derecha del
		        // ultimo elemento menor que el pivote insertado
		        intercambiar(vector, i, j);
		      }
		    }
		    // intercambiar el pivote con el elemento a la derecha del ultimo
		    // elemento menor que el pivote insertado
		    intercambiar(vector, i + 1, fin);
		    imprimirVector(vector);
		    // retornar posicion del pivote
		    return i + 1;
		  }
		  static void intercambiar(int[] arr, int indice1, int indice2) {
			    if (indice1 != indice2) {
			      int valorTemporal = arr[indice1];
			      arr[indice1] = arr[indice2];
			      arr[indice2] = valorTemporal;
			    }
			  }
			  static void imprimirVector(int[] array) {
			    for (int i = 0; i < array.length; i++) {
			      System.out.print(array[i] + " ");
			    }
			    System.out.println();
			  }
}
