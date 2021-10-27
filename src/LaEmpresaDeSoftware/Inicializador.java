package LaEmpresaDeSoftware;

import java.util.Scanner;

public class Inicializador {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        imprimirComienzoPrograma();
        FormularioPersona formularioPersona = solicitarDatosPersona(entrada);
        if (formularioPersona.getTipoEmpleado() == 1) {
            imprimirInformacionProgramador(formularioPersona);
        } else if (formularioPersona.getTipoEmpleado() == 2) {
            imprimirInformacionLiderTecnico(formularioPersona, entrada);
        } else if (formularioPersona.getTipoEmpleado() == 3) {
            imprimirInformacionDirector(formularioPersona, entrada);
        }
        entrada.close();
    }

    private static void imprimirComienzoPrograma() {
        System.out.println("Bienvenido al calculador de sueldos de la empresa ACME");
    }

    private static FormularioPersona solicitarDatosPersona(Scanner entrada) {
        FormularioPersona formularioPersona = new FormularioPersona();
        System.out.println("Ingrese Apellido:");
        formularioPersona.setApellido(entrada.nextLine());
        System.out.println("Ingrese Nombre:");
        formularioPersona.setNombre(entrada.nextLine());
        System.out.println("Ingrese edad:");
        formularioPersona.setEdad(Integer.parseInt(entrada.nextLine()));
        System.out.println("Ingrese sexo:");
        formularioPersona.setSexo(entrada.nextLine());
        System.out.println("Ingrese sueldo fijo mensual:");
        formularioPersona.setSueldoFijoMensual(Integer.parseInt(entrada.nextLine()));
        System.out.println("Ingrese tipo de empleado");
        System.out.println("1. Programador.");
        System.out.println("2. Lider tecnico.");
        System.out.println("3. Director.");
        formularioPersona.setTipoEmpleado(Integer.parseInt(entrada.nextLine()));
        return formularioPersona;
    }

    private static void imprimirInformacionProgramador(FormularioPersona formularioPersona) {
        Programador programador = new Programador(
            formularioPersona.getNombre(), 
            formularioPersona.getApellido(),
            formularioPersona.getSexo(), 
            formularioPersona.getEdad(), 
            formularioPersona.getSueldoFijoMensual());
        System.out.println(programador.obtenerDescripcion());
    }

    private static void imprimirInformacionLiderTecnico(FormularioPersona formularioPersona, Scanner entrada) {
        System.out.println("Ingresar horas extras trabajadas");
        int horasExtras = Integer.parseInt(entrada.nextLine());
        LiderTecnico liderTecnico = new LiderTecnico(
            formularioPersona.getNombre(), 
            formularioPersona.getApellido(),
            formularioPersona.getSexo(), 
            formularioPersona.getEdad(), 
            formularioPersona.getSueldoFijoMensual(),
            horasExtras );
        System.out.println(liderTecnico.obtenerDescripcion());
    }

    private static void imprimirInformacionDirector(FormularioPersona formularioPersona, Scanner entrada) {
        System.out.println("Ingresar porcentaje adicional");
        int porcentajeAdicional = Integer.parseInt(entrada.nextLine());
        Director director = new Director(
            formularioPersona.getNombre(), 
            formularioPersona.getApellido(),
            formularioPersona.getSexo(), 
            formularioPersona.getEdad(), 
            formularioPersona.getSueldoFijoMensual(),
            porcentajeAdicional);
        System.out.println(director.obtenerDescripcion());
    }
}
