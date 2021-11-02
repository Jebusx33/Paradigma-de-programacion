package elProcesadorDePagosEstratégico;

import java.util.Scanner;

public class Inicializador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese monto total");
		double monto = Double.parseDouble(scanner.nextLine());
		System.out.println("Ingrese dia de la semana: [1]Lunes - [7]Domingo");
		int dia = Integer.parseInt(scanner.nextLine());
		System.out.println("Ingrese metodo de pago: [1]Visa [2]PayPal [3]Efectivo");
		int metodoPago = Integer.parseInt(scanner.nextLine());
		procesarPago(monto, dia, metodoPago);
		scanner.close();
	}

	private static void procesarPago(double monto, int dia, int metodoPago) {
		ProcesadorPago procesadorPago = new ProcesadorPago(monto);
		procesadorPago.setEstrategiaDescuento(obtenerEstrategiaDescuento(dia));
		procesadorPago.setEstrategiaPago(obtenerEstrategiaPago(metodoPago));
		procesadorPago.pagar();
	}

	private static EstrategiaPago obtenerEstrategiaPago(int metodoPago) {
		if (metodoPago == 1) {
			return new EstrategiaPagoVisa();
		} else if (metodoPago == 2) {
			return new EstrategiaPagoPaypal();
		} else if (metodoPago == 3) {
			return new EstrategiaPagoEfectivo();
		} else {
			throw new RuntimeException("Metodo de pago invalido");
		}
	}

	private static EstrategiaDescuento obtenerEstrategiaDescuento(int diaSemana) {
		if (diaSemana >= 1 && diaSemana <= 5) {
			return new EstrategiaDescuentoDiasHabiles();
		} else if (diaSemana >= 6 && diaSemana <= 7) {
			return new EstrategiaDescuentoFinDeSemana();
		} else {
			throw new RuntimeException("Dia de semana invalido");
		}
	}
}
