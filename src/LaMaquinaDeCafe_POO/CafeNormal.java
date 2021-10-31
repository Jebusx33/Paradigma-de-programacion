package laMaquinaDeCafe_POO;

public class CafeNormal extends Cafe {

	public CafeNormal(int cantidadAzucar, int cantidadLeche, double precioAzucar, double precioLeche,
			double precioBaseBebida) {
		super(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Cafe Normal";
	}

	public double getPrecioBaseBebida() {
		// TODO Auto-generated method stub
		return precioBaseBebida * 1.20 * 1.05 + (precioAzucar * cantidadAzucar) + (precioLeche * cantidadLeche);
	}
}
