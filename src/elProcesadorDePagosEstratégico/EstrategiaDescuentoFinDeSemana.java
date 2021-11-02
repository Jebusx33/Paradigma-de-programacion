package elProcesadorDePagosEstratégico;

public class EstrategiaDescuentoFinDeSemana implements EstrategiaDescuento {
	@Override
	public double DescuentoAlMonto(double monto) {
		// TODO Auto-generated method stub
		return monto*0.80;
	}
}
