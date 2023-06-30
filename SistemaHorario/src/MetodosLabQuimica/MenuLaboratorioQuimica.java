package MetodosLabQuimica;

import java.util.Scanner;

import ClasesHerencia.Laboratorio;
import ClasesHerencia.LaboratorioQuimica;
import MenuPrincipal.MenuPrincipal;
import Metodos.ImplementacionMetodos;
import Metodos.ImplementacionMetodosLab;

public class MenuLaboratorioQuimica {

	ImplementacionMetodos implementacionMetodos = new ImplementacionMetodos();
	ImplementacionMetodosLab implementacionMetodosLab = new ImplementacionMetodosLab();
	LaboratorioQuimica info = new LaboratorioQuimica();
	MenuPrincipal infoM2 = new MenuPrincipal();
	public void menu() {
	 boolean salir = false;
	 Scanner scanner = new Scanner(System.in);
     do {
         System.out.println("\n---- Menú de Laboratorio Quimica ----");
         System.out.println("1. Asignar un horario y asignatura a un laboratorio");
         System.out.println("2. Liberar laboratorio de una asignatura y horario");
         System.out.println("3. Mostrar datos del laboratorio");
         System.out.println("4. Regresar al menu principal");
         System.out.print("Ingrese la opción deseada: ");

         int opcion = scanner.nextInt();
         scanner.nextLine();

         switch (opcion) {
             case 1:
            	 implementacionMetodosLab.realizarAsignacionQ();
            	 break;
             
             case 2:
            	 implementacionMetodosLab.realizarLiberacionQ();
            	 break;
            	 
             case 3:
            	 info.datosLaboratorio();
            	 break;
            	 
             case 4:
                 salir = true;
                 infoM2.menuPrincipal();
                 break;
             default:
                 System.out.println("Opción inválida, Ingrese una opcion valida.");
                 break;
         	}
     	} while (!salir);
	}
	
}
