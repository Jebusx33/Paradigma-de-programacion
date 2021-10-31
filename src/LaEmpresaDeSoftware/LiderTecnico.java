package laEmpresaDeSoftware;

public class LiderTecnico extends Persona {
	private int horasExtras;

	public LiderTecnico(String nombre, String apellido, String sexo, int edad, int sueldoFijoMensual, int horasExtras) {
		super(nombre, apellido, sexo, edad, sueldoFijoMensual);
		this.horasExtras = horasExtras;
	}

	/*
	 * @Override public double calcularSueldo() { double sueldoFijoMensual ;
	 * sueldoFijoMensual =horasExtras; //sueldoFijoMensual = (sueldoFijoMensual /
	 * 100) * 3 * horasExtras;
	 * 
	 * return sueldoFijoMensual; // (10000 / (20*8)) * (10* 2) }
	 */
	@Override
	public double calcularSueldo() {
		double sueldoFijoMensual = this.sueldoFijoMensual;
		return sueldoFijoMensual + (sueldoFijoMensual  / (20*8)) * ( 2 * horasExtras);
	}
	
	public String obtenerTipoEmpleado() {
		return "Lider Tecnico";
	}

}
