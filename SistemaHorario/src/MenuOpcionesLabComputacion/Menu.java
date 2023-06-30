package MenuOpcionesLabComputacion;
import java.util.Scanner;
import ClasesHerencia.*;
import Metodos.*;
import Main.Main;
import MenuPrincipal.MenuPrincipal;
public class Menu {

	ImplementacionMetodos implementacionMetodos = new ImplementacionMetodos();
	ImplementacionMetodosLab implementacionMetodosLab = new ImplementacionMetodosLab();
	Laboratorio info = new Laboratorio();
	MenuPrincipal info1 = new MenuPrincipal();
	public void menu() {
	 boolean salir = false;
	 Scanner scanner = new Scanner(System.in);
     do {
         System.out.println("\n---- Menú de Laboratorio computacion ----");
         System.out.println("1. Asignar un horario y asignatura a un laboratorio");
         System.out.println("2. Liberar laboratorio de una asignatura y horario");
         System.out.println("3. Mostrar datos del laboratorio");
         System.out.println("4. Regresar al menu principal");
         System.out.print("Ingrese la opción deseada: ");

         int opcion = scanner.nextInt();
         scanner.nextLine();

         switch (opcion) {
             case 1:
            	 implementacionMetodosLab.realizarAsignacion();
            	 break;
             
             case 2:
            	 implementacionMetodosLab.realizarLiberacion();
            	 break;
            	 
             case 3:
            	 info.datosLaboratorio();
            	 break;
            	 
             case 4:
                 salir = true;
                 info1.menuPrincipal();
                 break;
             default:
                 System.out.println("Opción inválida, Ingrese una opcion valida.");
                 break;
         	}
     	} while (!salir);
	}
}
