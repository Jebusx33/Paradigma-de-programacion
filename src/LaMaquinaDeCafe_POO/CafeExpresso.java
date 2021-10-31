package laMaquinaDeCafe_POO;

public class CafeExpresso extends Cafe {

	public CafeExpresso(int cantidadAzucar, int cantidadLeche, double precioAzucar, double precioLeche,
			double precioBaseBebida) {
		super(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Cafe Expresso";
	}

	public double getPrecioBaseBebida( ) {
		// TODO Auto-generated method stub
		double precioBebida= precioBaseBebida*1.20 * 1.10 + (precioAzucar*cantidadAzucar)+(precioLeche*cantidadLeche);
		return  precioBebida;
	}
}
