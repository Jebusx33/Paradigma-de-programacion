package LaEmpresaDeSoftware;

public class FormularioPersona {
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	private int sueldoFijoMensual;
	protected int tipoEmpleado;

	public FormularioPersona(){		
	}
	public FormularioPersona(String apellido, String nombre, int edad, String sexo, int sueldoFijoMensual){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.sueldoFijoMensual = sueldoFijoMensual;
		}
	

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getSueldoFijoMensual() {
		return sueldoFijoMensual;
	}
	public void setSueldoFijoMensual(int sueldoFijoMensual) {
		this.sueldoFijoMensual = sueldoFijoMensual;
	}
	public int getTipoEmpleado() {
		return tipoEmpleado;
	}
	public void setTipoEmpleado(int tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}



	
}
