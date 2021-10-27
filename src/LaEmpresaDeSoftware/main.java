package LaEmpresaDeSoftware;

public class main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormularioPersona formularioPersona = new FormularioPersona();
		
	//	System.out.println("Ingrese Apellido:");
        formularioPersona.setApellido("sarasa");
     //   System.out.println("Ingrese Nombre:");
        formularioPersona.setNombre("Pablo");
     //   System.out.println("Ingrese edad:");
        formularioPersona.setEdad(25);
       // System.out.println("Ingrese sexo:");
        formularioPersona.setSexo("m");
       // System.out.println("Ingrese sueldo fijo mensual:");
        formularioPersona.setSueldoFijoMensual(10000);
		formularioPersona.setTipoEmpleado(1);
	
		Programador programador = new Programador(
				//formularioPersona.getTipoEmpleado(),
				    formularioPersona.getNombre(), 
		            formularioPersona.getApellido(),
		            formularioPersona.getSexo(), 
		            formularioPersona.getEdad(), 
		            formularioPersona.getSueldoFijoMensual());
	        System.out.println(programador.obtenerDescripcion());
	       // System.out.println(programador.testTipoEmp());
	        
	        int horasExtras =10;
	        LiderTecnico liderTecnico = new LiderTecnico(
					//formularioPersona.getTipoEmpleado(),
					    formularioPersona.getNombre(), 
			            formularioPersona.getApellido(),
			            formularioPersona.getSexo(), 
			            formularioPersona.getEdad(), 
			            formularioPersona.getSueldoFijoMensual(),
			            horasExtras);
		        System.out.println(liderTecnico.obtenerDescripcion());
		        
		        int porcentajeAdicional = 10;
		       Director director = new Director(		    		 
		            formularioPersona.getNombre(), 
		            formularioPersona.getApellido(),
		            formularioPersona.getSexo(), 
		            formularioPersona.getEdad(), 
		            formularioPersona.getSueldoFijoMensual(),
		            porcentajeAdicional);
		        System.out.println(director.obtenerDescripcion());
	        
/*	
		
		Persona personas = new Persona(
				//formularioPersona.getTipoEmpleado(),
				 formularioPersona.getNombre(), 
		            formularioPersona.getApellido(),
		            formularioPersona.getSexo(), 
		            formularioPersona.getEdad(), 
		            formularioPersona.getSueldoFijoMensual());
	        System.out.println(personas.obtenerDescripcion());
		
		*/
	}

}
