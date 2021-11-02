package elProcesadorDePagosEstratégico;

public class EstrategiaPagoEfectivo implements EstrategiaPago{
	@Override
	public void pagar(double monto) {
		// TODO Auto-generated method stub
		System.out.println("Se pago con efectivo");
	}
}
