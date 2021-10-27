package El_Jefe_y_su_único_empleado;

public class Empleado {

	private String nombre;
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

public String datosEmpleado() {
return "Datos Empleado: Tipo: Empleado, Nombre: "+ nombre + ", Edad: "
			+ String.valueOf(edad);
}	
      
 

}
