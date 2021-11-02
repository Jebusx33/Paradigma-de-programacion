package laEmpresaDeSoftware;

public abstract class Persona  {
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	private int sueldoFijoMensual;
	private int tipoEmpleado;
	
	public Persona(String nombre, String apellido, String sexo, int edad, int sueldoFijoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.sueldoFijoMensual = sueldoFijoMensual;
	}
	

    public String obtenerDescripcion() {
		return "Tipo: "+obtenerTipoEmpleado()+", Apellido: " + apellido + ", Nombre: " + nombre
				+ ", Edad: " + edad + ", Sexo: " + sexo + ", Sueldo mensual: " + calcularSueldo();
	}
    
    public abstract double calcularSueldo();
	public abstract String obtenerTipoEmpleado();


	public int getSueldoFijoMensual() {
		return sueldoFijoMensual;
	}


	public int getTipoEmpleado() {
		return tipoEmpleado;
	}

}
