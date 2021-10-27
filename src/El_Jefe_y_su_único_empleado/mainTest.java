package El_Jefe_y_su_único_empleado;

import java.util.Scanner;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJefe jefe = new TestJefe();
		    jefe.setNombre("polo");
		    jefe.setEdad(65);
            Empleado empleado = new Empleado();
            empleado.setNombre("lalal");
            int edad = 25;
  	         empleado.setEdad(edad);
  	      
  	       //jefe.contratarEmpleado(empleado);
            empleado.datosEmpleado();
           // jefe.obtenerDatos();
           
	}
	

	
	
/*
	  private static void mostrarInformacionJefe(TestJefe jefe ) {
		    if (jefe != null) {
		      System.out.println(jefe.obtenerDatos());
		    } else {
		      System.out.println("No se puede mostrar informacion " +
		      "si el jefe no esta cargado");
		    }
		  }
	*/
	
}
