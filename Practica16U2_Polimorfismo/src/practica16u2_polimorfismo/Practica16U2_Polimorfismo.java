
package practica16u2_polimorfismo;

public class Practica16U2_Polimorfismo {

    public static void main(String[] args) {
        mostrarDatosFiguras(new Triangulo(4, 5,"amarillo"));
        mostrarDatosFiguras(new Circulo(5,"verde"));
        mostrarDatosFiguras(new Cuadrado(10,"Rojo"));        
    }
    //APLICANDO POLIMORFISMO 
    //la gran ventaja del polimorfismo es la reutlizacion del codigo 
    //Al forzar a todas las clases a tener el mismo formato de metodo
    //esta expresion vale para cualquier subclase de figura
    //cuyos objtos vengan aqui como parametro
    private static void mostrarDatosFiguras(Figura f){
        System.out.println("color :" + f.getColor());
        System.out.println("Superficie :" + f.superficie());
    }
    
    
}
