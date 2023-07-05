
package practica14u2_interfaces;

import java.util.Scanner;

public class Circulo implements Figura, Dibujar, Rotar{
    Scanner sc = new Scanner(System.in);
double r;
public Circulo(){

}

    public Circulo(double r) {
        this.r = r;
    }
    
    @Override
    public double calcularArea() {
       
       System.out.println("INGRESE EL RADIO : ");
       r=sc.nextDouble();
       double pi=3.1416;
       double result=pi*r*r;     
       System.out.println("EL AREA ES : "+result);
       return result;
    }

    @Override
    public void Dibujar() {
      System.out.println("HOLA SI VALE DIBUJAR CIRCULO");
    }

    @Override
    public void Rotar() {
        System.out.println("HOLA SI VALE ROTAR CIRCULO");
    }
    
}
