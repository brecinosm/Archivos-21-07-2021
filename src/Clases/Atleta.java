package Clases;

public class Atleta {

        private String deporte, tiempo, activo;

        public Atleta (String deporte, String tiempo, String activo){
            this.deporte = deporte;
            this.tiempo = tiempo;
            this.activo = activo;
        }

    public void imprimir (){
        System.out.println("Su deporte es: " + deporte);
        System.out.println("Su tiempo es: " + tiempo);
        System.out.println("Se encuentra activo : " + activo);
    }

}
