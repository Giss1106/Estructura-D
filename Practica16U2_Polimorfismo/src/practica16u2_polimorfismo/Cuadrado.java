
package practica16u2_polimorfismo;

import java.util.Scanner;

public class Cuadrado extends Figura{
Scanner sc = new Scanner(System.in);
double lado;

public Cuadrado(double lado, String color){
    super(color);
    this.lado=lado;
}
    
    
    @Override
    public double superficie() {
       System.out.println("INGRESE EL lado : ");
       lado=sc.nextDouble();
        double result=lado*lado;
       // System.out.println("EL AREA ES : "+result);
        return result;
    }
    
}
