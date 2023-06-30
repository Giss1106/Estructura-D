package MenuPrincipal;

import java.util.Scanner;
import MenuOpcionesLabComputacion.Menu;
import MetodosHorarios.*;
import MetodosLabQuimica.*;

public class MenuPrincipal {

	public void menuPrincipal() {
		Menu menu1 = new Menu();
		MenuHorario menu2 = new MenuHorario();
		MenuLaboratorioQuimica menu3 = new MenuLaboratorioQuimica();

		boolean salir = false;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n---- Menú Principal ----");
			System.out.println("1. Menu Laboratorio computacion");
			System.out.println("2. Menu Laboratorio quimica");
			System.out.println("3. Menu Horarios");
			System.out.println("4. Salir");
			System.out.print("Ingrese la opción deseada: ");

			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				menu1.menu();
				break;

			case 2:
				menu3.menu();;
				break;

			case 3:
				menu2.menuH();
				break;

			case 4:
				salir = true;
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida, Ingrese una opcion valida.");
				break;
			}
		} while (!salir);

	}
}
