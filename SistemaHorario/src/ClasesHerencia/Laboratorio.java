package ClasesHerencia;

public class Laboratorio {

	int CantidadComputadoras, CantidadEstudiantes,CantidadImpresora;
	int RepetidorInternet;
	String NombreLab, NombreLaboratorista;
	String [] horarios;
	int [] AsignaturasOcupanLab;
	String [] Asignaturas;
	public Laboratorio(int cantidadComputadoras, int cantidadEstudiantes, int repetidorInternet, int cantidadImpresora, String nombreLab, String nombreLaboratorista) {
		CantidadComputadoras = cantidadComputadoras;
		CantidadEstudiantes = cantidadEstudiantes;
		RepetidorInternet = repetidorInternet;
		CantidadImpresora = cantidadImpresora;
		NombreLab = nombreLab;
		NombreLaboratorista = nombreLaboratorista;
	}
	
	public Laboratorio() {
		this.CantidadComputadoras = 20;
		this.CantidadEstudiantes = 20;
		this.RepetidorInternet = 1;
		this.CantidadImpresora = 2;
		this.NombreLab = "Computacion";
		this.NombreLaboratorista = "Luis Zambrano";
	}
	
	public Laboratorio(String [] horarios) {
		this.horarios = horarios;
        Asignaturas = new String[horarios.length];
        AsignaturasOcupanLab = new int[horarios.length];
    }
	
	public int getCantidadComputadoras() {
		return CantidadComputadoras;
	}

	public void setCantidadComputadoras(int cantidadComputadoras) {
		CantidadComputadoras = cantidadComputadoras;
	}

	public int getCantidadEstudiantes() {
		return CantidadEstudiantes;
	}

	public void setCantidadEstudiantes(int cantidadEstudiantes) {
		CantidadEstudiantes = cantidadEstudiantes;
	}

	public int getCantidadImpresora() {
		return CantidadImpresora;
	}

	public String getNombreLab() {
		return NombreLab;
	}

	public void setNombreLab(String nombreLab) {
		NombreLab = nombreLab;
	}

	public void setCantidadImpresora(int cantidadImpresora) {
		CantidadImpresora = cantidadImpresora;
	}

	public int getRepetidorInternet() {
		return RepetidorInternet;
	}

	public void setRepetidorInternet(int repetidorInternet) {
		RepetidorInternet = repetidorInternet;
	}
	
	public String getNombreLaboratorista() {
		return NombreLaboratorista;
	}

	public void setNombreLaboratorista(String nombreLaboratorista) {
		NombreLaboratorista = nombreLaboratorista;
	}

	public void datosLaboratorio() {
		System.out.println("El laboratorio de " + NombreLab + "contiene los siguientes datos: " + "\nDirector del laboratorio: " + NombreLaboratorista + "\nCantidad de computadoras: " + CantidadComputadoras + "\nEl laboratorio tiene una capacidad para " + CantidadEstudiantes + " estudiantes maximo" + "\nCuenta con " + CantidadImpresora + " impresoras dentro del laboratorio" + "\nEl laboratorio cuenta con " + RepetidorInternet + " extenciones de internet");
	}
	
	public void ocuparLaboratorio(String horario, String asignatura) {
        int index = obtenerIndiceHorario(horario);
        if (index != -1) {
            if (AsignaturasOcupanLab[index] < 2) {
            	AsignaturasOcupanLab[index]++;
                Asignaturas[index] = asignatura;
                System.out.println("Laboratorio ocupado en el horario " + horario + " con la asignatura " + asignatura);
            } else {
                System.out.println("El laboratorio está ocupado en el horario " + horario + ". No se puede ocupar más.");
            }
        } else {
            System.out.println("El horario especificado no existe.");
        }
    }
	
	public void liberarLaboratorio(String horario) {
        int index = obtenerIndiceHorario(horario);
        if (index != -1) {
            if (AsignaturasOcupanLab[index] > 0) {
                AsignaturasOcupanLab[index]--;
                Asignaturas[index] = null;
                System.out.println("Laboratorio liberado en el horario " + horario);
            } else {
                System.out.println("El laboratorio ya está libre en el horario " + horario);
            }
        } else {
            System.out.println("El horario especificado no existe.");
        }
    }
	
	private int obtenerIndiceHorario(String horario) {
        for (int i = 0; i < horarios.length; i++) {
            if (horarios[i] != null && horarios[i].equals(horario)) {
                return i;
            }
        }
        return -1;
    }
	
	public void mostrarHorariosDisponibles() {
        System.out.println("---- Horarios Disponibles ----");
        for (int i = 0; i < horarios.length; i++) {
            if (Asignaturas[i] == null) {
                System.out.println(horarios[i] + ": Disponible");
            } else {
                System.out.println(horarios[i] + ": Ocupado por " + Asignaturas[i]);
            }
        }
    }
}
