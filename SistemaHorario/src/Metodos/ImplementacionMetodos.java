package Metodos;
import java.util.Scanner;
public class ImplementacionMetodos {

	Scanner scanner = new Scanner(System.in);
	String[] horarios = {"mañana", "tarde", "noche"};
	public MetodosAsignarHorario metodosAsignarHorario = new MetodosAsignarHorario(horarios);
	
		public void realizarAsignacion() {
		System.out.print("Ingrese el nombre de la asignatura: ");
        String asignatura = scanner.next();
        System.out.print("Ingrese el horario de la asignatura: ");
        String horario = scanner.next();
        metodosAsignarHorario.agregarAsignatura(asignatura, horario);
    }
	
		public void realizarLiberacion() {
        System.out.print("Ingrese el horario que decee liberar(Manñana, tarde o tarde noche): ");
        String horario = scanner.next();
        metodosAsignarHorario.liberarHorario(horario);
    }
	
	
}
