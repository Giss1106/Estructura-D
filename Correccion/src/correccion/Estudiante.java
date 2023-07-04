/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccion;

/**
 *
 * @author gisse
 */
public class Estudiante extends Persona {

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
    
    private int id;
    public String carrera;
    public String semestres;
    public Estudiante(String nombre, int cedula, String apellido, int edad,int id, String carrera,String semestres) {
        super(nombre, cedula, apellido, edad);
        this.semestres=semestres;
        this.carrera=carrera;
        this.id=id;
    }
    
      public void mostrarDatos(){
        System.out.println("DATOS DE ESTUDIANTE");
        System.out.println("EL Sr/a " + nombre+" "+apellido);
        System.out.println("SE ENCUENTRA INSCRITO EN LA CARRERA DE " + carrera);
        System.out.println("CURSANDO EL " + semestres+" SEMESTRE");
    }
}
