package MetodosHorarios;
import java.util.Scanner;

import MenuPrincipal.MenuPrincipal;
import Metodos.*;

public class MenuHorario {

	ImplementacionMetodos implementacionMetodos = new ImplementacionMetodos();
	ImplementacionMetodosLab implementacionMetodosLab = new ImplementacionMetodosLab();
	
	public void menuH() {
		
		 boolean salir = false;
		 Scanner scanner = new Scanner(System.in);
		 MenuPrincipal infoM1 = new MenuPrincipal();
	     do {
	         System.out.println("\n---- Menú de Horarios ----");
	         System.out.println("1. Asignar horario a una asignatura");
	         System.out.println("2. Liberar horario de una asignatura");
	         System.out.println("3. Regresar al menu principal");
	         System.out.print("Ingrese la opción deseada: ");

	         int opcion = scanner.nextInt();
	         scanner.nextLine();

	         switch (opcion) {
	             case 1:
	            	 implementacionMetodos.realizarAsignacion();
	            	 break;
	             
	             case 2:
	            	 implementacionMetodos.realizarLiberacion();
	            	 break;
	            	 
	             case 3:
	                 salir = true;
	                 infoM1.menuPrincipal();
	                 break;
	             default:
	                 System.out.println("Opción inválida, Ingrese una opcion valida.");
	                 break;
	         	}
	     	} while (!salir);
	}
	
}
