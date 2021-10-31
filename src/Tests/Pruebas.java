package tests;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//multiplos de 3
		int unidad=3;
		int energia = 7;
		int cantidadSaltos=0;
		/*for (int i = 0; i < energia; i++) {
			if (energia%3==0) {
				cantidadSaltos+=energia/unidad;
			}
		}*/
		cantidadSaltos=energia/unidad; 
		System.out.println("cantidad de saltos "+ cantidadSaltos);
		
	}

}
