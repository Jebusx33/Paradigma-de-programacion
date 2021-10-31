package laMaquinaDeCafe_POO;

import java.util.Scanner;

public class main {
/*
 * Cafe Expresso con 1 de azucar y con 2 de leche : 157.00↵
Te Verde con 2 de azucar y con 1 de leche : 158.00↵
Subtotal: 315.00↵
Total: 381.15↵ Te Verde con 2 de azucar y con 1 de leche: 157.99999999999997
 * */
	private static double precioAzucar = 5;
    private static double precioLeche = 10;
    private static double precioBaseBebida = 100;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double subtotal = 0;
        imprimirSaludo();
        int cantidadBebidas = solicitarCantidadBebidas(entrada);
        Bebida[] bebidas = new Bebida[cantidadBebidas];
        for (int i = 0; i < cantidadBebidas; i++) {
            int tipoBebida = solicitarTipoBebida(entrada);
            bebidas[i] = construirBebida(tipoBebida, entrada);
            subtotal = subtotal + bebidas[i].getPrecioSubtotal();
        }
        imprimirDetallesBebidas(bebidas);
        imprimirTotales(subtotal);
    }
    
    private static Bebida construirBebida(int tipoBebida, Scanner entrada) {
        if (tipoBebida == 1) {
            return construirCafe(tipoBebida, entrada);
        } else if (tipoBebida == 2) {
            return construirTe(tipoBebida, entrada);
        } else {
            throw new RuntimeException("tipo de bebida invalido");
        }
    }
    
    private static Bebida construirCafe(int tipoBebida, Scanner entrada) {
        int tipoCafe = solicitarTipoCafe(entrada);
        int cantidadAzucar = solicitarCantidadAzucar(entrada);
        int cantidadLeche = solicitarCantidadLeche(entrada);
        if (tipoCafe == 1) {
            return new CafeExpresso(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
        } else if (tipoCafe == 2) {
            return new CafeRistretto(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
        } else if (tipoCafe == 3) {
            return new CafeNormal(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
        } else {
            throw new RuntimeException("tipo de cafe invalido");
        }
        
    }
    
    private static Bebida construirTe(int tipoBebida, Scanner entrada) {
        int tipoTe = solicitarTipoTe(entrada);
        int cantidadAzucar = solicitarCantidadAzucar(entrada);
        int cantidadLeche = solicitarCantidadLeche(entrada);
        if (tipoTe == 1) {
            return new TeNegro(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
        } else if (tipoTe == 2) {
            return new TeRojo(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
        } else if (tipoTe == 3) {
            return new TeVerde(cantidadAzucar, cantidadLeche, precioAzucar, precioLeche, precioBaseBebida);
        }
        throw new RuntimeException("tipo de cafe invalido");
    }
    
    private static void imprimirTotales(double subtotal) {
        double total = subtotal + ((subtotal * 21) / 100);
        System.out.println("Subtotal: " + String.format("%.02f", subtotal));
        System.out.println("Total: " + String.format("%.02f", total));
    }
    
    private static void imprimirDetallesBebidas(Bebida[] bebidas) {
        for (int i = 0; i < bebidas.length; i++) {
            System.out.println(bebidas[i].getDetalleItem());
        }
    }
    
    private static void imprimirSaludo() {
        System.out.println("Bienvenido a la maquina de cafe");
    }
    
    private static int solicitarCantidadBebidas(Scanner entrada) {
        System.out.println("Ingrese cantidad de bebidas");
        return Integer.parseInt(entrada.nextLine());
    }
    
    private static int solicitarTipoBebida(Scanner entrada) {
        System.out.println("Ingrese el tipo de bebida: [1]Cafe [2]Te");
        return Integer.parseInt(entrada.nextLine());
    }
    
    private static int solicitarTipoCafe(Scanner entrada) {
        System.out.println("Ingrese el tipo de Cafe: [1]Expresso [2]Ristretto [3]Normal");
        return Integer.parseInt(entrada.nextLine());
    }
    
    private static int solicitarTipoTe(Scanner entrada) {
        System.out.println("Ingrese el tipo de Te: [1]Negro [2]Rojo [3]Verde");
        return Integer.parseInt(entrada.nextLine());
    }
    
    private static int solicitarCantidadAzucar(Scanner entrada) {
        System.out.println("Ingrese Cantidad de Azucar: 0 a 3");
        return Integer.parseInt(entrada.nextLine());
    }
    
    private static int solicitarCantidadLeche(Scanner entrada) {
        System.out.println("Ingrese Cantidad de Leche: 0 a 3");
        return Integer.parseInt(entrada.nextLine());
    }
    

}
