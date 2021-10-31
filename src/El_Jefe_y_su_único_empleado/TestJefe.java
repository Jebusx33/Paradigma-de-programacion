package el_Jefe_y_su_único_empleado;

public class TestJefe {

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
		
		if (this.empleado.getNombre() != null) {
			if (empleado == empleado) {
				System.out.println(" ya tienes empleado"); 
			}else {
			System.out.println("Se contrato al empleado con exito");}
		}
		
		
		
		
	}
	
	
	/*
	public String obtenerDatos() {
		// TODO Auto-generated method stub
		System.out.println("Tipo: Jefe, Nombre: " + this.nombre + ", Edad: " + String.valueOf(this.edad));
	
	
		String datos="";
		if (empleado.getNombre() != null) {
			System.out.println("Tipo: Empleado, Nombre: " + empleado.getNombre() + ", Edad: " + empleado.getEdad());
			
		}else {
			System.out.println("Sin datos");
			System.out.println("Tipo: Empleado, Nombre: " + empleado.getNombre() + ", Edad: " + empleado.getEdad());
		}
		return datos;
	}*/
	
	
}
