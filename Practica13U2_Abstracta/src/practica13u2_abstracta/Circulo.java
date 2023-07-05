
package practica13u2_abstracta;

public class Circulo extends Figura{
double r=2;
public Circulo(){
    
}

    public Circulo(double r) {
        this.r = r;
    }

    public Circulo(double r, double x, double y) {
        super(x, y);
        this.r = r;
    }
    @Override
    public double calcularArea() {
        double pi=3.1416;
        double result=pi*r*r;
        System.out.println("EL AREA ES : "+result);
        return result;
    }
    
}
