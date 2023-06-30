package Metodos;

public class MetodosAsignarHorario {

	 String[] asignaturas;
	 String[] horarios;
	 
	 public MetodosAsignarHorario(String[] horarios) {
	        this.horarios = horarios;
	        asignaturas = new String[horarios.length];
	    }
	 public void agregarAsignatura(String asignatura, String horario) {
		    int indiceHorario = obtenerIndiceHorario(horario);
		    if (indiceHorario != -1) {
		        if (asignaturas[indiceHorario] == null) {
		            asignaturas[indiceHorario] = asignatura;
		            System.out.println("Asignatura '" + asignatura + "' añadida al horario '" + horario + "'.");
		        } else {
		            System.out.println("El horario '" + horario + "' ya tiene asignada la asignatura '" + asignaturas[indiceHorario] + "'.");
		        }
		    } else {
		        System.out.println("El horario especificado no existe.");
		    }
		}

	 
	 private int contarAsignaturasEnHorario(String horario) {
		    int asignaturasOcupadas = 0;
		    for (String asignaturaAsignada : asignaturas) {
		        if (asignaturaAsignada != null && asignaturaAsignada.equals(horario)) {
		            asignaturasOcupadas++;
		        }
		    }
		    return asignaturasOcupadas;
		}
	 
	 public boolean liberarHorario(String horario) {
	        int index = obtenerIndiceHorario(horario);
	        if (index != -1) {
	            if (asignaturas[index] != null) {
	                asignaturas[index] = null;
	                horarios[index] = null;
	                System.out.println("Horario " + horario + " Ha sido liberado");
	                return true;
	            } else {
	                System.out.println("El horario " + horario + "ya esta libre" );
	            }
	        } else {
	            System.out.println("El horario especificado no existe.");
	        }
	        return false;
	    }
	 
	 public int obtenerIndiceHorario(String horario) {
	        for (int i = 0; i < horarios.length; i++) {
	            if (horarios[i] != null && horarios[i].equals(horario)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	 public int obtenerIndiceAsignatura(String asignatura) {
	        for (int i = 0; i < asignaturas.length; i++) {
	            if (asignaturas[i] != null && asignaturas[i].equals(asignatura)) {
	                return i;
	            }
	        }
	        return -1;
	    }    
}
