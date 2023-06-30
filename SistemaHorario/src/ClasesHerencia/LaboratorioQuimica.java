package ClasesHerencia;

public class LaboratorioQuimica extends Laboratorio{

	int cantidadTubosEnsayos, cantidadVasoPrecipitado, cantidadMatracesErlenmeyer, cantidadEmbudos, cantidadMicrocospio;

	public LaboratorioQuimica(int cantidadComputadoras, int cantidadEstudiantes, int repetidorInternet, int cantidadImpresora, String nombreLab, String nombreLaboratorista, int cantidadTubosEnsayos, int cantidadVasoPrecipitado, int cantidadMatracesErlenmeyer, int cantidadEmbudos, int cantidadMicrocospio) {
		super(cantidadComputadoras, cantidadEstudiantes, repetidorInternet, cantidadImpresora, nombreLab,
				nombreLaboratorista);
		this.cantidadTubosEnsayos = cantidadTubosEnsayos;
		this.cantidadVasoPrecipitado = cantidadVasoPrecipitado;
		this.cantidadMatracesErlenmeyer = cantidadMatracesErlenmeyer;
		this.cantidadEmbudos = cantidadEmbudos;
		this.cantidadMicrocospio = cantidadMicrocospio;
	}
	
	public LaboratorioQuimica(String [] horarios) {
		this.horarios = horarios;
        Asignaturas = new String[horarios.length];
        AsignaturasOcupanLab = new int[horarios.length];
    }

	public int getCantidadTubosEnsayos() {
		return cantidadTubosEnsayos;
	}

	public void setCantidadTubosEnsayos(int cantidadTubosEnsayos) {
		this.cantidadTubosEnsayos = cantidadTubosEnsayos;
	}

	public int getCantidadVasoPrecipitado() {
		return cantidadVasoPrecipitado;
	}

	public void setCantidadVasoPrecipitado(int cantidadVasoPrecipitado) {
		this.cantidadVasoPrecipitado = cantidadVasoPrecipitado;
	}

	public int getCantidadMatracesErlenmeyer() {
		return cantidadMatracesErlenmeyer;
	}

	public void setCantidadMatracesErlenmeyer(int cantidadMatracesErlenmeyer) {
		this.cantidadMatracesErlenmeyer = cantidadMatracesErlenmeyer;
	}

	public int getCantidadEmbudos() {
		return cantidadEmbudos;
	}

	public void setCantidadEmbudos(int cantidadEmbudos) {
		this.cantidadEmbudos = cantidadEmbudos;
	}

	public int getCantidadMicrocospio() {
		return cantidadMicrocospio;
	}

	public void setCantidadMicrocospio(int cantidadMicrocospio) {
		this.cantidadMicrocospio = cantidadMicrocospio;
	}
	
	public void ocuparLaboratorioQ(String horario, String asignatura) {
        int index = obtenerIndiceHorarioQ(horario);
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
	
	public void liberarLaboratorioQ(String horario) {
        int index = obtenerIndiceHorarioQ(horario);
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
	
	private int obtenerIndiceHorarioQ(String horario) {
        for (int i = 0; i < horarios.length; i++) {
            if (horarios[i] != null && horarios[i].equals(horario)) {
                return i;
            }
        }
        return -1;
    }
	
	public void mostrarHorariosDisponiblesQ() {
        System.out.println("---- Horarios Disponibles ----");
        for (int i = 0; i < horarios.length; i++) {
            if (Asignaturas[i] == null) {
                System.out.println(horarios[i] + ": Disponible");
            } else {
                System.out.println(horarios[i] + ": Ocupado por " + Asignaturas[i]);
            }
        }
    }
	
	public LaboratorioQuimica() {
		this.RepetidorInternet = 1;
		this.NombreLab = "Quimica";
		this.NombreLaboratorista = "Jorge Ceballos";
		this.CantidadImpresora = 1;
		this.CantidadComputadoras = 2;
		this.CantidadEstudiantes = 10;
		this.cantidadTubosEnsayos = 5;
		this.cantidadVasoPrecipitado = 3;
		this.cantidadMatracesErlenmeyer = 4;
		this.cantidadEmbudos = 2;
		this.cantidadMicrocospio = 1;
	}
	
	@Override
	public void datosLaboratorio() {
		System.out.println("El laboratorio de " + NombreLab + "contiene los siguientes datos: " + "\nDirector del laboratorio: " + NombreLaboratorista + "\nCantidad de computadoras: " + CantidadComputadoras + "\nEl laboratorio tiene una capacidad para " + CantidadEstudiantes + "estudiantes maximo" + "\nCuenta con " + CantidadImpresora + "dentro del laboratorio" + "\nEl laboratorio cuenta con " + RepetidorInternet + "extenciones de internet" + "\nCantidad de tubos de ensayo: " + cantidadTubosEnsayos + "\nCantidad de vasos de precipitacion: " + cantidadVasoPrecipitado + "\nCantidad de matraces erlenmeyer: " + cantidadMatracesErlenmeyer + "\nCantidad de embudos: " + cantidadEmbudos + "\nCantidad de microscopios: " + cantidadMicrocospio);
	}
	
	
}
