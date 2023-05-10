/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto4oplogicos;

/**
 *
 * @author ESPE
 */
public class Proyecto4OpLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //operadores logicos
        int valor1=5;
        int valor2=10;
         System.out.println((valor1==valor2) && (valor1!=valor2));
           System.out.println((valor1==valor2)||(valor1!=valor2));
           System.out.println(valor1!=valor2);
           ////////////////
           System.out.println((int)(Math.random()*100));
            System.out.println(Math.random()*100);
             System.out.println(Math.random());
             /////////////
              System.out.println("    ");
             int a=0;
             a=(int)(Math.random()*100);
             //int b=5;
            
             boolean resultado=a>=10 && a<=60;
              System.out.println(resultado);
            
    }
    
}
