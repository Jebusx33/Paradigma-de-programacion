package Potenciacion;
/*
 * con Base 1 (si n=0) 
 * caso recursivo Base * BasE(n-1) (si n > 0) 
 * 
 * */
public class Potenciacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(Potenciacion(2, 6));
	}

	static int Potenciacion(int base, int exponente) {
		if (exponente == 0) {
			return 1;
		} else {
			System.out.println(2 +" * " + "potenciacion( "+base+", "+(exponente-1)+" )");
           return base * Potenciacion(base, exponente -1);
		}
	}
	
	
}
