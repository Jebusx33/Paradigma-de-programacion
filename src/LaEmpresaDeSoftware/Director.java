package laEmpresaDeSoftware;

public class Director extends Persona {

	private int porcentajeAdicional;

	public Director(String nombre, String apellido, String sexo, int edad, int sueldoFijoMensual,
			int porcentajeAdicional) {
		super(nombre, apellido, sexo, edad, sueldoFijoMensual);
		this.porcentajeAdicional = porcentajeAdicional;
	}


	public double calcularSueldo() {
		double sueldoFijoMensual = this.sueldoFijoMensual;
		return sueldoFijoMensual * ((porcentajeAdicional / 100.0) + 1);
	}

	
	public String obtenerTipoEmpleado() {
		return "Director";
	}





}
