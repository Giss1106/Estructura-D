package Personal;

public class Personal {
	//clase padre
	//constructore de lo objetos

	public int getPorcen() {
		return porcen;
	}

	public void setPorcen(int porcen) {
		this.porcen = porcen;
	}

	public int getSuel() {
		return suel;
	}

	public void setSuel(int suel) {
		this.suel = suel;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	///declaracion objetos propios de la clase que eran heredados a las clases hijas
String nombre;
String apellido;
int cedula;
int  telefono;
String correo;
int porcen;
int sueldo;
int suel;
public void setNombre(String nombre) {//DECLARO UNA VRIABLE NOMBRE DE TIPO STRING 
	this.nombre=nombre;
}

public String getNombre() {
    return nombre;
}
public void setapellido(String apellido) {//DECLARO UNA VRIABLE NOMBRE DE TIPO STRING 
	this.apellido=apellido;
}

public String getapellido() {
    return apellido;
}
public void setcorreo(String correo) {//DECLARO UNA VRIABLE NOMBRE DE TIPO STRING 
	this.correo=correo;
}

public String getcorreo() {
    return correo;
}
public void setcedula(int cedula) {//DECLARO UNA VRIABLE NOMBRE DE TIPO STRING 
	this.cedula=cedula;
}

public int getcedula() {
    return cedula;
}
public void settelefono(int  telefono) {//DECLARO UNA VRIABLE NOMBRE DE TIPO STRING 
	this. telefono= telefono;
}

public int gettelefono() {
    return  telefono;
}

//creo metodo para preguntar si el empleao tiene una comicion

public void Persona() {
	System.out.println("¿EL EMPLEADO TIENE UNA COMICION A SU SUELDO ESTE MES DE TRABAJO?");
	System.out.println("                      1. SI         2.NO");
}
public void Pago() {
	
}
//creo metodo pra heredar e ingrese los datos del empleado
public void IngreoDato() {
	
}

}
