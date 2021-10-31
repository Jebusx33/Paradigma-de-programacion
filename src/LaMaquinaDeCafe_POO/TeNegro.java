package laMaquinaDeCafe_POO;

public class TeNegro extends Te {

	public TeNegro(int cantidadAzucar, int cantidadLeche, double precioAzucar, double precioLeche,
			double precioBaseBebida) {
		super(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
		// TODO Auto-generated constructor stub

	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Te Negro";
	}

	public double getPrecioBaseBebida() {
		// TODO Auto-generated method stub
		double precioBebida=precioBaseBebida * 1.150 * 1.100 + (precioAzucar * cantidadAzucar) + (precioLeche * cantidadLeche);
		return  Math.round(precioBebida*100.00)/100.00;	
	}
}
