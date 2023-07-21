package Personal;

import java.util.Scanner;

public class Tecnico extends Personal{
	Scanner sc=new Scanner(System.in);
	
	int opc;
public Tecnico(String areaTrabajo) {
		super();
		// TODO Auto-generated constructor stub
		this.areaTrabajo = areaTrabajo;
	}
public Tecnico() {
	
}


//objeto propio de la clase
String areaTrabajo="TECNICO";

//metodo heredado de la clase padre Personal
//solicitar el ingreso de datos del empleado
public void IngreoDato() {
	System.out.println("INGRESE EL NOMBRE DEL "+areaTrabajo);
	nombre=sc.nextLine();
	System.out.println("INGRESE EL APELLIDO DEL "+areaTrabajo);
	apellido=sc.nextLine();
	System.out.println("INGRESE EL CORRERO DEL "+areaTrabajo);
	correo=sc.nextLine();
	System.out.println("INGRESE NUMERO DE CEDULA DEL "+areaTrabajo);
	cedula=sc.nextInt();
	System.out.println("INGRESE NUMERO DE TELEFONO DEL "+areaTrabajo);
	telefono=sc.nextInt();
	System.out.println("INGRESE EL SUELDO DEL"+areaTrabajo);
	suel=sc.nextInt();
	do {
		//llamo al metodo persona de la clase padre para preguntar si el empleado tiene o no comision
	Persona();
	System.out.println("INGRESE UNA OPCION ");
	opc=sc.nextInt();
	switch(opc) {
	case 1:
		System.out.println("SU SUELDO BASICO ES DE "+suel+" MENSUAL");
		System.out.println("AH OBTENIDO UNA COMISION");
		System.out.println("ELIJA POR FAVOR LA RAZON DE LA COMISION DEL EMPLEADO");
		//llamo a la clase menu para ingresar el metodo del menu secundario
		Menu menusito=new Menu();
		menusito.MenuSecundario();
		break;
	case 2:
		System.out.println("EL SUELDO DEL EMPLEADO SEGUIRA SIENDO EL MISMO");
		System.out.println("NO OBTUVO UN COMISION NI POR GUAPO/A");
		break;
		default:
			System.out.println("INGRESE UNA OPCION CORRECTA, VUELVA A INGRESAR ");
			
	}}while(opc>2);
}
}
