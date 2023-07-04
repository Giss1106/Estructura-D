/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talleru2;

/**
 *
 * @author gisse
 */
public class TallerU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Auto auto = new Auto("ABC-123", "KIA", 4, 100);
        auto.mostrarauto();
        auto.onofparabtisas();
        auto.addmulta();
        System.out.println("MULTA : " + auto.getMulta());
        
        System.out.println(" ");

        Camion camion = new Camion("DFG-456", "KIA", 8, 100);
        camion.mostrarcamion();
        camion.onofparabtisas();
        camion.setColor("NEGRO");
        camion.setCarga(800.0);
        System.out.println("COLOR: " + camion.getColor());
        System.out.println("CARGA: " + camion.getCarga());
        
    }
    
}
