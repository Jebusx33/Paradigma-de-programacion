package TorreDeHanoi;

public class hanoi {

	public static void main(String[] args) {
		moverTorre(3, "A", "B", "C");

	}

	static void moverTorre(int cantidadDiscos, String origen, String destino, String temporal) {
		if (cantidadDiscos > 0) {
			moverTorre(cantidadDiscos - 1, origen, temporal, destino);
			moverDisco(cantidadDiscos, origen, destino);
			moverTorre(cantidadDiscos - 1, temporal, destino, origen);
		}
	}

	static void moverDisco(int disco, String origen, String destino) {
		System.out.println("Mover disco" + disco + " de: " + origen + " a: " + destino);
	}
}
