package Tareas;
import java.util.*;
public class Edad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //funcion de fecha
        Calendar cal = new GregorianCalendar();
        //variables globales
        int anoActual = cal.get(Calendar.YEAR), ano, anoResultado;
        System.out.print("ingrese su año de nacimiento: ");
        ano = entrada.nextInt();
        anoResultado = (anoActual - ano);
        System.out.print("Welcome my friend your age is : " + anoResultado + " years ");
    }

}