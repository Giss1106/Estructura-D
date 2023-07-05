
package practica14u2_interfaces;

import java.util.Scanner;

public class Cuadrado implements Figura, Dibujar{
    Scanner sc = new Scanner(System.in);
double lado=20;
public Cuadrado(){
   
}
public Cuadrado(double lado){
    this.lado=lado;
}
    @Override
    public double calcularArea() {
        System.out.println("INGRESE EL lado : ");
       lado=sc.nextDouble();
        double result=lado*lado;
        System.out.println("EL AREA ES : "+result);
        return result;
    }

    @Override
    public void Dibujar() {
        System.out.println("HOLA SI VALE DIBUJAR CUADRADO");
    }
    
}
