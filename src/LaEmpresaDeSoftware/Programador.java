package laEmpresaDeSoftware;

public class Programador extends Persona {
     
	public Programador( String nombre, String apellido, String sexo, int edad, int sueldoFijoMensual) {	
	super( nombre, apellido, sexo, edad, sueldoFijoMensual);

	}
/*
	@Override
	public String obtenerTipoEmpleado() {
		 
		String dato = String.valueOf(super.tipoEmpleado);
		if (tipoEmpleado== 1) {
			dato = "Programador";
		} else if (tipoEmpleado == 2) {
			dato = "Líder Técnico";
		} else if (tipoEmpleado == 3) {
			dato = "Director";
		}
		return dato;
	}*/

	public double calcularSueldo(){
		double sueldoFijoMensual = getSueldoFijoMensual();
		return sueldoFijoMensual;
	}
 

	public String obtenerTipoEmpleado() {
    	return "Programador" ;
    	}
	

	


}
