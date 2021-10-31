package el_Jefe_y_su_único_empleado;

public class Jefe extends Empleado {

	private String nombre;
	private int edad;
	private Empleado empleado;

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

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public void contratarEmpleado(Empleado empleado) {
		if (this.empleado == null) {
			this.empleado = empleado;
			System.out.println("Se contrato al empleado con exito");
		} else {
			System.out.println("Error: Ya tiene un empleado contratado");
		}
	}

	public void despedirEmpleado() {
		if (this.empleado != null) {
			System.out.println("Se despidio al empleado");
			this.empleado=null;
		}else{
			System.out.println("Error: No tiene empleados contratados");
		}
	}

	public String obtenerDatos() {
		String datos = "Tipo: Jefe, Nombre: " + nombre + ", Edad: " + edad+"\n";
		if (empleado == null) {
			datos += "No tengo empleados a cargo"; 
		}else {
			datos += empleado.datosEmpleado(); 
		}
		return datos;
	}


}
