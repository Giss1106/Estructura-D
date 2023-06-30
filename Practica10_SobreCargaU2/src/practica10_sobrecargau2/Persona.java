
package practica10_sobrecargau2;

public class Persona {

 //INGRESAR ATRIBUTOS
    String nombre;
    int edad;
    int cedula;
 //CONSTRUCTOR DE ATRIBUTOS
    public Persona (String nombre, int edad){
        //THIS. TOMA EN CUENTA EL ATRIBUTO Y = ABSOVE LO QUE CONTIENE EL PARAMETRO
        this.nombre=nombre;
        this.edad=edad;
    }
//SOBRE CARGA DE CONTRUCTORES, SEGUNDO CONSTRUCTOR CON DIFERENTE PARAMETRO/OTRO TIPO DE DATO
    public Persona (int cedula){
        //THIS. TOMA EN CUENTA EL ATRIBUTO Y = ABSOVE LO QUE CONTIENE EL PARAMETRO
        this.cedula=cedula;
    }
  //CREAR METODOS ACCION
    public void Jugar ( ){
        System.out.println("MI NOMMBRE ES: "+nombre+ "VOY A JUAGR");
    }
    //sobre carga de metodo ingresando un parametro
     public void Jugar (String juego){
        System.out.println("VOY A JUGAR: "+juego+ "ME GUSTA MUCHO");
    }
    
    
 //INGRESAR METODOS DE LOS ATRIBUTOS
 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }   
    
    
}
