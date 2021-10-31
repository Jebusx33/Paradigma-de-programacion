package el_Jefe_y_su_único_empleado;

public class empleadoOK {

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
		// TODO Auto-generated method stub

		if (empleado != null) {
			System.out.println("Se contrato al empleado con exito");
		}else {
			System.out.println("Error: Ya tiene un empleado contratado");
		}

	}

	public void despedirEmpleado() {
		// TODO Auto-generated method stub

	}

	public String obtenerDatos() {
		// TODO Auto-generated method stub
		System.out.println("Tipo: Jefe, Nombre: " + nombre + ", Edad: " + edad);
		String datos;
		if (empleado != null) {
			datos = "Datos Empleado: Tipo: Empleado, Nombre: " + empleado.getNombre() + ", Edad: "
					+ String.valueOf(empleado.getEdad());
			return datos;
		} else {
			datos = "No tengo empleados a cargo";
			return datos;
		}

	}

}
