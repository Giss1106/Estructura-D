
package practica11_sobreescriturau2;

import Animal.Animal; //importar el paquete de animal con el nombre de la clase q vamos a usar
//llamamos a la clase animal con extends
public class Persona extends Animal{
    
    //creo metodo agregamos @Override para llamar al metodo
    @Override
    public void comer(){
        System.out.println("SOY UN HUMANO MI IQ ES DE 150"); 
    }
    
    
}
