
package practica12;

public class cLimitada extends Cuenta{
    //metodo de deposito y de retiro
String deposito;
String retiro;
    public cLimitada(String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
    }
    //metodo de deposito y de retiro
    public void Deposito(String deposito){
        System.out.println("SR "+nombre+" "+apellido+" con cedula "+cedula);
        System.out.println("EL DEPOSITO ES DE : "+deposito);
    }
    public void Retiro(String retiro){
        System.out.println("SR "+nombre+" "+apellido+" con cedula "+cedula);
         System.out.println("EL RETIRO ES DE : "+retiro);
    }
    
    
}
