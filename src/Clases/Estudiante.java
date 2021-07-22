package Clases;

public class Estudiante {

    private String nombre, dpi;
    private int edad;

    public Estudiante (String nombre, int edad, String dpi){
            this.nombre = nombre;
            this.edad = edad;
            this.dpi = dpi;
    }


    public void imprimir (){
        System.out.print("\nDATOS RECOLETADOS");
        System.out.println("\nSu nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su dpi es: " + dpi);
    }
}
