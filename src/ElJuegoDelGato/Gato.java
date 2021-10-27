package ElJuegoDelGato;

public class Gato {

	private String nombre;
	private int energia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void saltar() {
		int cantidadSaltos = energia / 3;
		if (energia >= 3 && cantidadSaltos <= 3) {
			energia-=3;
			System.out.println("Soy "+nombre+", salte y gaste 3 unidades");
		}else if(energia>=0 && energia<3){
		    System.out.println("Soy "+nombre+", no tengo energia para saltar");
		}else{
		    System.out.println("Soy "+nombre+", me quedan "+energia+" unidades de energia");
		}
	}

	public void correr(int minutos) {
		if (energia>0 && energia - minutos <=10 || minutos<=10 ) {
			System.out.println("Soy "+nombre+", corri "+minutos+" minutos");
			energia -= minutos;
		}else if(minutos>10 || energia - minutos > 10 ){
			System.out.println("Soy "+nombre+", no tengo suficiente energia para correr "+minutos+" minutos");
		}
	}

	public void comer(int unidades) {
		System.out.println("tengo " + energia + " de energia");

		if (energia + unidades <= 10) {
			energia += unidades;
			System.out.println("Soy " + nombre + ", comi " + unidades + " unidades");
		} else {
			int resto = 10 - energia;
			System.out.println("Soy " + nombre + ", no puedo comer mas de: " + resto + " unidades");
		}

		System.out.println("tengo " + energia + " de energia");
	}

	public void mostrarInformacion() {
		System.out.println("Soy " + nombre + ", me quedan " + energia + " unidades de energia");
	}

	public int obtenerSaltosQuePuedeDar(int cantidadSaltos) {
		return cantidadSaltos = energia / 3;

	}

	public int obtenerSaltosQuePuedeDar() {
		return obtenerSaltosQuePuedeDar(energia);
	}

	public void saltar(int operacion) {
		// TODO Auto-generated method stub
		
	}

}
