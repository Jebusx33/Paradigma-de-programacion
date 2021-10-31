package laMaquinaDeCafe_POO;

public class TeVerde extends Te {

	public TeVerde(int cantidadAzucar, int cantidadLeche, double precioAzucar, double precioLeche,
			double precioBaseBebida) {
		super(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Te Verde";
	}

	public double getPrecioBaseBebida() {
		// TODO Auto-generated method stub
		double precioBebida=precioBaseBebida * 1.15 * 1.20 +( (precioAzucar * cantidadAzucar) + (precioLeche * cantidadLeche));
		return  Math.round(precioBebida*100.0)/100.0d;	
	}
}
