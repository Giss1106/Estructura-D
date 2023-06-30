/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica12;


//import java.util.Scanner;
public class Practica12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner sc=new Scanner(System.in);Scanner sc=new Scanner(System.in);
        //Scanner sc=new Scanner(System.in);
        Cuenta cuenta1=new Cuenta("Gissela","Saldarriaga",1720868809);
        cuenta1.IngreoDatosN(201201201);
        Cuenta cuenta2=new Cuenta("1720868809","******");
        cuenta2.IngreoDatosP(201201201);
        cLimitada limitada1=new cLimitada("GISSELA ","SALDARRIAGA ",1720868809);
        limitada1.Deposito("2.013 USD");
        cLimitada limitada2=new cLimitada("GISSELA ","SALDARRIAGA ",1720868809);
        limitada2.Retiro("500 USD");
    }
    
}
