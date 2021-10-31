package laMaquinaDeCafe_POO;

public class TeRojo extends Te {

	public TeRojo(int cantidadAzucar, int cantidadLeche, double precioAzucar, double precioLeche,
			double precioBaseBebida) {
		super(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Te Rojo";
	}

	public double getPrecioBaseBebida() {
		// TODO Auto-generated method stub
		return precioBaseBebida * 1.15 * 1.15 + (precioAzucar * cantidadAzucar) + (precioLeche * cantidadLeche);
	}
}
