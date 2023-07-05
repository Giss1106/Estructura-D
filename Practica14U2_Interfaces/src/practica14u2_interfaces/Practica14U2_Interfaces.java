
package practica14u2_interfaces;
import java.util.Scanner;
public class Practica14U2_Interfaces {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("CIRCULO ");
        Circulo circulo1=new Circulo();
        circulo1.calcularArea();
        Circulo circulo2=new Circulo();
        circulo2.Dibujar();
        Circulo circulo3=new Circulo();
        circulo3.Rotar();
        ///////////
        System.out.println("CUADRADO");
        Cuadrado cuadrado1=new Cuadrado();
        cuadrado1.calcularArea();
        Cuadrado cuadrado2=new Cuadrado();
        cuadrado2.Dibujar();
        
        
    }
    
}
