
package Modelo;

public class Modelo {

    public int getTotal1() {
        return total1;
    }

    public void setTotal1(int total1) {
        this.total1 = total1;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    

    

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    private int v1;
     private int v2;
    //sumar();
    private int total=sumar();
    private int total1=resta();
    private int total2=multiplicar();
   // private int total3=dividir();
            
    public Modelo(){
        
    }
    public int sumar(){
        this.total=this.v1+this.v2;
        return this.total;
    }
     public int resta(){
        this.total1=this.v1-this.v2;
        return this.total1;
    }
      public int multiplicar(){
        this.total2=this.v1*this.v2;
        return this.total2;
    }
      
}
