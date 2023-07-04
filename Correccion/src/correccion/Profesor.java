/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccion;

/**
 *
 * @author gisse
 */
public class Profesor extends Persona{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestres() {
        return semestres;
    }

    public void setSemestres(String semestres) {
        this.semestres = semestres;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    private int id;
    public String carrera;
    public String semestres;
    public String materia;
    public Profesor(String nombre, int cedula, String apellido, int edad,int id, String carrera,String semestres,String materia) {
        super(nombre, cedula, apellido, edad);
        this.semestres=semestres;
        this.carrera=carrera;
        this.id=id;
        this.materia=materia;
    }
    public void mostrarDatosProfe(){
        System.out.println("DATOS DEL PROFESOR");
        System.out.println("EL PROFESOR " + nombre+" "+apellido+" CON ID "+id);
        System.out.println("SE ENCUENTRA DADO CLASES EN LA CARRERA DE " + carrera);
        System.out.println("A LOS ESTUDIANTES DE " + semestres+" SEMESTRE");
  System.out.println("LA MATERIA DE "+materia);
    }
   

}
