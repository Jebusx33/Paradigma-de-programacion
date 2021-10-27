package BusquedaBinaria;

/*
 *Ejercicio 2: Búsqueda Binaria de letras

Hacer un programa utilice la búsqueda binaria para buscar una letra en un codigo
Tener en cuenta que el codigo que se ingresa debe tener las letras ordenadas. Ejemplo "abghopz"
Parte del programa ya se encuentra implementado, agregar lo que falta.

Ejemplos de salidas del programa:

Ingresar el codigo:
abghopz
Ingresar la letra a buscar:
p
La letra p se encuentra en la posicion 5

Ingresar el codigo:
abghopz
Ingresar la letra a buscar:
w
La letra w no se encuentra en el codigo ingresado
 */
public class BusquedaBinariaLetras {

	public static void main(String[] args) {
		java.util.Scanner lector = new java.util.Scanner(System.in);
		System.out.println("Ingresar el codigo:");
		String codigo = lector.nextLine();
		char[] codigoComoArray = codigo.toCharArray();
		System.out.println("Ingresar la letra a buscar:");
		char letra = lector.nextLine().charAt(0);
		int posicion = busquedaBinaria(codigoComoArray, letra);
		// caso Base
		if (posicion != -1) {
			System.out.println("La letra " + letra + " se encuentra en la posicion " + posicion);
		} else {
			System.out.println("La letra " + letra + " no se encuentra en el codigo ingresado");
		}
	}

	// caso recursivo
	// Implementar la funcion busquedaBinaria
	static int busquedaBinaria(char[] vector, int numeroABuscar) {
		int inicio = 0;
		int fin = vector.length - 1;
		do {
			int puntoMedio = (inicio + fin) / 2;

			if (vector[puntoMedio] == numeroABuscar) {
				return puntoMedio;
			}
			if (numeroABuscar > vector[puntoMedio]) {
				inicio = puntoMedio + 1;
			} else {
				fin = puntoMedio - 1;
			}
		} while (inicio <= fin);
		return -1;
	}
}
