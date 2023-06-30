
package practica12;

//import java.util.Scanner;
public class Cuenta {
        //Scanner sc=new Scanner(System.in);

    String nombre,apellido;
    int cedula;
    int numCuenta;
    String ingreso,usuario,contra;
    int saldo;
    
    public  Cuenta (String nombre,String apellido,int cedula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        
    }
    public void IngreoDatosN(int numCuenta){
        System.out.println("INGRESE SU NOMBRE "+nombre);
        System.out.println("INGRESE SU APELLIDO "+apellido);
        System.out.println("INGRESE SU CEDULA "+cedula);
        System.out.println("INGRESE SU NUM DE CUENTA "+numCuenta);
        //numCuenta=sc.nextInt();
        
        
    }  public void IngreoDatosP(int numCuenta){
        System.out.println("");
        System.out.println("INGRESE SU USUARIO: "+usuario);
        System.out.println("INGRESE SU CONTRASENA: "+contra);
        
    }
     public  Cuenta(String usuario,String contra){
       this.usuario=usuario;
        this.contra=contra;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
