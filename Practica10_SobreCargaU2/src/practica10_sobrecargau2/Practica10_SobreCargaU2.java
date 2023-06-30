
package practica10_sobrecargau2;


public class Practica10_SobreCargaU2 {

    public static void main(String[] args) {
//LLAMO A CLASE EPRSONA Y CREO PARA LLAMAR EL METODO
        Persona persona1=new Persona("GISSELA  ",22);
        //LLAMAR AL METODO JUGAR
        persona1.Jugar();
//CREO OTRO PARA LLAMAR A MI CLASE PARA LLAMAR A LA SOBRE CARGA DE MI METODO
        Persona persona2=new Persona(1720868809);
        //LLAMO A LA SOBRE CARGA DEL METODO
        persona2.Jugar( " jugando ando ");
    }
    
}
