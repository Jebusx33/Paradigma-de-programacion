package laMaquinaDeCafe_POO;

public abstract class Bebida {
	protected int cantidadAzucar;
	protected int cantidadLeche;
	protected double precioAzucar;
	protected double precioLeche;
	protected double precioBaseBebida;

	public Bebida(int cantidadAzucar, int cantidadLeche, double precioAzucar, double precioLeche,
			double precioBaseBebida) {
	
		this.cantidadAzucar = cantidadAzucar;
		this.cantidadLeche = cantidadLeche;
		this.precioAzucar = precioAzucar;
		this.precioLeche = precioLeche;
		this.precioBaseBebida = precioBaseBebida;
	}

	public double getPrecioSubtotal() {
		// TODO Auto-generated method stub
		return getPrecioBaseBebida();
	}

	public abstract String getDescripcion();

	public double getPrecioBaseBebida() {
		// TODO Auto-generated method stub

		return getPrecioBaseBebida();
	}

	public String getDetalleItem() {
		// TODO Auto-generated method stub
		return  getDescripcion() + getDescripcionAzucar() + getDescripcionLeche() + String.format("%.02f", getPrecioBaseBebida());
	}

	private String getDescripcionAzucar() {
		// "Cafe Expresso con 1 de azucar y con 2 de leche: 157.00"
		return " con " + cantidadAzucar + " de azucar";
	}

	private double getPrecioAzucar() {
		double precioxAzucar = precioAzucar;
		return precioxAzucar;
	}

	private String getDescripcionLeche() {
		return " y con " + cantidadLeche + " de leche : ";
	}

	private double getPrecioLeche() {
		double precioxLeche = precioLeche;
		return precioxLeche;
	}

}
