
package practica13u2_abstracta;

public  class Cuadrado extends Figura{
double lado=4;
    @Override
    public double calcularArea() {
    
    double resul=lado*lado;
    System.out.println("EL AREA ES : "+resul);
    return resul;
    }

    public Cuadrado() {
        
    }

    public Cuadrado(double lado,double x, double y) {
        super(x, y);
        this.lado=lado;
    }

   
   
    
}
