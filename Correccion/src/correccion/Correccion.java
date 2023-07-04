/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correccion;

/**
 *
 * @author gisse
 */
public class Correccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Profesor profe = new Profesor("ALFREDO","GARCIA","BIOTECNOLOGIA","SEGUNDO","QUIMICA");
        Profesor profe=new Profesor("ALFREDO", 1720868809, "SALAZAR", 35,1234, "TECNOLOGIAS","TERCER","BASE DE DATOS");
        System.out.println(" ");
        profe.mostrarDatosProfe();
        Estudiante estudi=new Estudiante("GISSELA", 1720868809, "SALDARRIAGA", 22,4567, "TECNOLOGIAS","TERCER");
        System.out.println(" ");
        estudi.mostrarDatos();
        
    }
    
}
