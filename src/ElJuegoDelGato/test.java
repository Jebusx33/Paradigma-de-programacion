package ElJuegoDelGato;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Comer     
  - Comer se usa para recargar la energía del gato y se le debe indicar cuantas unidades comer
  - Como máximo el gato puede tener 10 unidades de energia que equivalen a 10 unidades de comida
  - Si el gato puede comer la cantidad de unidades que se le indican debe imprimir:
     "Soy Tom, comi 10 unidades"
  - Si el gato no puede comer la cantidad de unidades dado que se va a pasar de las 10 unidades de energia 
    máxima debe imprimir:
     "Soy Tom, no puedo comer mas de: 4 unidades" (suponiendo que tenia 6 unidades de energia)
   */
		 Scanner lector = new Scanner(System.in);
		    System.out.println("El juego del Gato");
		    System.out.println("Ingrese el nombre del gato");
		    Gato gato = new Gato();
		    gato.setNombre(lector.nextLine());
		    
        int operacion;
	    do {
	      System.out.println("Elegir opcion (1. Correr, 2.Saltar, 3. Comer, 4.Salir)");
	      operacion = Integer.parseInt(lector.nextLine());
	      if (operacion == 1) {
	        System.out.println("Ingrese el tiempo en minutos");
	        gato.correr(Integer.parseInt(lector.nextLine()));
	      } else if (operacion == 2) {
	        gato.saltar(operacion);
	      } else if ( operacion == 3) {
	        System.out.println("Ingrese la cantidad de unidades");
	        gato.comer(Integer.parseInt(lector.nextLine()));
	      } 
	    } while (operacion >= 1 && operacion <=3);
	    gato.mostrarInformacion();
	    System.out.println(gato.getNombre() + " puede dar " + gato.obtenerSaltosQuePuedeDar() + " saltos");
	 
	  }
	
	

}

