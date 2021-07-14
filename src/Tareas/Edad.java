package Tareas;
import java.util.*;
public class Edad {

    public static void main (String [] args){
        //variables globales
        int edad, ano, resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese su año de nacimiento: ");
        edad = entrada.nextInt();
        ano = 2021;
        resultado = ano-edad;

        System.out.print("Welcome my friend your age is : " + resultado + " years");

    }
}