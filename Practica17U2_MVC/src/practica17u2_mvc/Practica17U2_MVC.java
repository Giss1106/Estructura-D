
package practica17u2_mvc;

import Controlador.Control;
import Modelo.Modelo;
import Vista.Vista;

public class Practica17U2_MVC {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HOLA MUNDO");
        Modelo mod=new Modelo();
        Vista vis=new Vista();
        Control cont=new Control(vis,mod);
        Control cont1=new Control(vis,mod);
        Control cont2=new Control(vis,mod);
        cont.iniciar();
        cont1.iniciar1();
        cont2.iniciar2();
        vis.setVisible(true);
        
    }
    
}
