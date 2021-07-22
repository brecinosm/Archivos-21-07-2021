package Clases;

public class CuentaAhorro {
    private String banco, cuenta, tipoCuenta;


    public  CuentaAhorro(String banco, String cuenta, String tipoCuenta){

        this.banco = banco;
        this.cuenta = cuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public void imprimir (){
        System.out.println("Su banco es: " + banco);
        System.out.println("Su cuenta es: " + cuenta);
        System.out.println("Su tipo de cuenta es: " +tipoCuenta);
    }

}
