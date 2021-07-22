package Clases;
import java.util.*;
public class Test {

    public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

        String   deporte = "Futbol";
        String   tiempo = "1 año";
        String   activo = "Sí";

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();a
        entrada.nextLine();
        System.out.print("Ingrese su dpi: ");
        String dpi = entrada.nextLine();
        System.out.print("Ingrese su banco: ");
        String banco = entrada.nextLine();
        System.out.print("Ingrese su cuenta: ");
        String cuenta = entrada.nextLine();
        System.out.print("Ingrese su tipo de cuenta: ");
        String tipoCuenta = entrada.nextLine();


        Estudiante mensajero = new Estudiante(nombre, edad, dpi);
        mensajero.imprimir();
        CuentaAhorro mensajero2 = new CuentaAhorro(banco, cuenta, tipoCuenta);
        mensajero2.imprimir();
        Atleta mensajero3 = new Atleta(deporte, tiempo, activo);
        mensajero3.imprimir();
    }
}
