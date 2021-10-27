package OrdenarmientoPorInsercion;
/*
Ejercicio 4: Ordenamiento por Inserción Descedente

Implementar el algoritmo de ordenamiento por Inserción para que 
ordene en forma descendente el lugar de ascendente.
Parte del programa ya se encuentra implementado, completar lo que falta

Ejemplos de salida del programa:

Ingresar numeros del vector separados por coma
1,2,3,4,5,6
Resultado
6,5,4,3,2,1

*/
import java.util.Arrays;

public class ordenamientoPorInsercionAcendente {

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
	    		int matrizAux= vector[i];
	    		int indice= i-1;
	    		do {
	    			vector[indice+1] = vector[indice];
		    		indice--;
				} while (indice >=0 && vector[indice] > matrizAux );
	    	
	    		vector[indice+1]=matrizAux;
			}
	    			
	    	
	    }

	    	
	    	
	    static int[] convertirListaSeparadaPorComaEnArrayDeEnteros(String lista) {
	      int[] numeros = Arrays.asList(lista.split(",")).stream()
	        .map(String::trim)
	        .mapToInt(Integer::parseInt).toArray();    
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
