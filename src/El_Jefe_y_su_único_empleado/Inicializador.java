/*
 Ejercicio 7: El Jefe y su único empleado

Un empresario necesita un sistema para cargar sus datos y los de un único empleado.
Los datos que quiere cargar tanto de él como los de su empleado son nombre y edad y luego 
necesita tener la posibilidad de despedir al empleado, contratar uno nuevo y mostrar la información cargada.
En una primera charla nos indicó que quería un menú como el siguiente:

Bienvenido a la empresa ACME
Ingrese opción:
1. Cargar Jefe / 2. Contratar Empleado / 3. Despedir Empleado / 4. Mostrar información Jefe / 5. Salir

En donde:
    1. Cargar Jefe debe pedirle al usuario el nombre y la edad del jefe y guardarlo en el sistema
    2. Contratar Empleado debe pedirle al usuario el nombre y la edad del empleado 
        ◦ Si el Jefe ya tenia cargado un empleado se debe imprimir un mensaje de error: 
          "Error: Ya tiene un empleado contratado”
        ◦ Si se puede cargar el empleado exitosamente se debe imprimir: 
          "Se contrato al empleado con éxito"
    3. Despedir empleado debe des-asociar el empleado del jefe
        ◦ Si se puede despedir al empleado exitosamente se debe imprimir: "Se despidió al empleado"
        ◦ Si el jefe no tenía empleados asociados se debe imprimir: "Error: No tiene empleados contratados"
    4. Mostrar información debe imprimir la información del jefe y su empleado. 
        ◦ En caso de que tuviera un empleado por ejemplo imprimiría: 
             Tipo: Jefe, Nombre: pedro, Edad: 45
             Datos Empleado: Tipo: Empleado, Nombre: pablo, Edad: 30
        ◦ En caso que no tenga empleados por ejemplo imprimiría
             Tipo: Jefe, Nombre: pedro, Edad: 45
             No tengo empleados a cargo
        
Notas de Implemetación
    • Ya se encuentra implementada la clase que arranca el programa y obtiene los datos del usuario
      llamada Inicializador.
    • Crear 2 clases: Jefe y Empleado.
    • Jefe debe tener como atributo a la clase Empleado.
    • Tratá primero de implementar las clases para que compile y puedas arrancar el programa y luego
      corré el test una única vez para ver como deben ser las salidas.
    • Para simplificar el ejercicio no se requieren validaciones. 
 */
package El_Jefe_y_su_único_empleado;

import java.util.Scanner;


public class Inicializador {

	  public static void main(String[] args) {
		    System.out.println("Bienvenido a la empresa ACME");
		    Scanner lector = new Scanner(System.in);
		    boolean terminar = false;
		    Jefe jefe = null;
		    do {
		      mostrarMenu();
		      int opcion = Integer.parseInt(lector.nextLine());
		      if (opcion == 1) {
		        jefe = crearJefe(lector);
		      } else if (opcion == 2) {
		        contratarEmpleado(lector,jefe);
		      } else if (opcion == 3) {
		        despedirEmpleado(jefe);
		      } else if (opcion == 4) {
		        mostrarInformacionJefe(jefe);
		      } else if (opcion == 5) {
		        terminar = true;
		      } else {
		        System.out.println("Opcion incorrecta");
		      }
		    } while(terminar == false);  
		  }
		  
		  private static void mostrarMenu() {
		    String menu = "Ingrese opcion:\n";
		    menu += "1. Cargar Jefe / " + 
		    "2. Contratar Empleado / " +
		    "3. Despedir Empleado / " + 
		    "4. Mostrar informacion Jefe / " +
		    "5. Salir";
		    System.out.println(menu);
		  }
		  
		  private static Jefe crearJefe(Scanner lector) {
		    Jefe jefe = new Jefe();
		    System.out.println("Ingresar nombre del jefe");
		    jefe.setNombre(lector.nextLine());
		    System.out.println("Ingresar edad del jefe");
		    int edad = Integer.parseInt(lector.nextLine());
		    jefe.setEdad(edad);
		    return jefe;
		  }
		  
		  private static void contratarEmpleado(Scanner lector, Jefe jefe) {
		    if (jefe != null) {
		      Empleado empleado = new Empleado();
		      System.out.println("Ingresar nombre del empleado");
		      empleado.setNombre(lector.nextLine());
		      System.out.println("Ingresar edad del empleado");
		      int edad = Integer.parseInt(lector.nextLine());
		      empleado.setEdad(edad);
		      jefe.contratarEmpleado(empleado);
		    } else {
		      System.out.println("No se puede contratar empleado si " +
		      "el jefe no esta cargado");
		    }
		  }
		  
		  private static void despedirEmpleado(Jefe jefe) {
		    if (jefe != null) {
		      jefe.despedirEmpleado();
		    } else {
		      System.out.println("No se puede despedir empleado " +
		      "si el jefe no esta cargado");
		    }
		  }
		  
		  private static void mostrarInformacionJefe(Jefe jefe ) {
		    if (jefe != null) {
		      System.out.println(jefe.obtenerDatos());
		    } else {
		      System.out.println("No se puede mostrar informacion " +
		      "si el jefe no esta cargado");
		    }
		  }

		}
