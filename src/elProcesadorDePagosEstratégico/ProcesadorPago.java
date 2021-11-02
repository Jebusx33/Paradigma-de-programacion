package elProcesadorDePagosEstrat�gico;

public class ProcesadorPago {
	private double monto;
	private EstrategiaDescuento estrategiaDescuento;
	private EstrategiaPago estrategiaPago;

	public ProcesadorPago(double monto) {
		this.monto = monto;

	}

	public void setEstrategiaDescuento(EstrategiaDescuento estrategiaDescuento) {
		this.estrategiaDescuento = estrategiaDescuento;
	}

	public void setEstrategiaPago(EstrategiaPago estrategiaPago) {
		this.estrategiaPago = estrategiaPago;
	}

	// Agregar c�digo a este m�todo
	public void pagar() {
		double montoConDescuento = estrategiaDescuento.DescuentoAlMonto(monto);
		System.out.println("Monto: " + monto + "\nMonto con descuento: " + montoConDescuento);
		estrategiaPago.pagar(montoConDescuento);
	}

}
