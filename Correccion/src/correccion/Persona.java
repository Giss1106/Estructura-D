/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correccion;

/**
 *
 * @author gisse
 */
public class Persona {

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    private int cedula,edad;
    public String nombre;
    public String apellido;
     public Persona (String nombre,int cedula,String apellido,int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula; 
         this.edad=edad; 
     }
    
}
