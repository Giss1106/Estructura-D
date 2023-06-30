package Metodos;
import ClasesHerencia.*;
import java.util.Scanner;
public class ImplementacionMetodosLab {
	String[] horarios = {"mañana", "tarde", "noche"};
	Laboratorio laboratorio = new Laboratorio(horarios);
	LaboratorioQuimica laboratorioQ = new LaboratorioQuimica(horarios);
	Scanner scanner = new Scanner(System.in);
	public void mostrarHorariosDisponibles() {
        laboratorio.mostrarHorariosDisponibles();
    }

	public void realizarAsignacion() {
        System.out.println("Ingrese el nombre de la asignatura: ");
        String asignatura = scanner.nextLine();
        System.out.println("Ingrese el horario de la asignatura (mañana, tarde o tarde noche): ");
        String horario = scanner.nextLine();

        laboratorio.ocuparLaboratorio(horario, asignatura);
    }
	
	public void realizarLiberacion() {
		System.out.print("Para desocupar un laboratorio ingrese el horario en el cual se va a eliminar su uso");
        System.out.println("Ingrese el horario: ");
        String horario = scanner.nextLine();
        laboratorio.liberarLaboratorio(horario);
    }
	
	public void realizarAsignacionQ() {
        System.out.println("Ingrese el horario de la asignatura (mañana, tarde o tarde noche): ");
        String horario = scanner.nextLine();
        System.out.println("Ingrese el nombre de la asignatura: ");
        String asignatura = scanner.nextLine();

        laboratorioQ.ocuparLaboratorioQ(horario, asignatura);
    }
	
	public void realizarLiberacionQ() {
		System.out.print("Para desocupar un laboratorio ingrese el nombre de la asignatura y el horario");
        System.out.println("Ingrese el horario: ");
        String horario = scanner.nextLine();
        laboratorioQ.liberarLaboratorioQ(horario);
    }
}
