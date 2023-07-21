package Personal;

import java.util.Scanner;

public class Menu extends Personal{
	//objetos definidos propios
int opc;
double res;
double total;
double comision;
Scanner sc=new Scanner(System.in);
//menu principal que me va preguntar por cual empleao ingresar los datos
public void Menus() {
	
	System.out.println("     SISTEMA PERSONAL");
	System.out.println("1. DOCENTE");
	System.out.println("2. TECNICO");
	System.out.println("3. ADMINISTRADOR");
	System.out.println("4. LIMPIEZA");
	System.out.println("5. SALIR");
	System.out.println("INGRESE UNA OPCION");
	opc=sc.nextInt();
	do {
	switch (opc) {
	case 1:
		System.out.println("1. DOCENTE");
		//instancio el objto para llamar al metodo de ingreso de datos de la clase hija Docente
		Docente doc=new Docente();
		doc.IngreoDato();
		
		Menus();
		break;
	case 2:
		System.out.println("2. TECNICO");
		//instancio el objto para llamar al metodo de ingreso de datos de la clase hija Tecnico
		Tecnico tec=new Tecnico();
		tec.IngreoDato();
		break;
	case 3:
		System.out.println("3. ADMINISTRADOR");
		//instancio el objto para llamar al metodo de ingreso de datos de la clase hija Adminitrador
		Administrador add=new Administrador();
		add.IngreoDato();
		break;
	case 4:
		System.out.println("4. LIMPIEZA");
		//instancio el objto para llamar al metodo de ingreso de datos de la clase hija Limpieza
		Limpieza lim=new Limpieza();
		lim.IngreoDato();
		break;
	case 5:
		System.out.println("5. SALIR");
		break;
	default:
		System.out.println("OPCION INCORRECTA VUELVA A INGRESAR");
		Menus();
	}	
		
	}while (opc>4);
}
////////////////////////////////////////
//Menu secundario para realizar la comision del empleado
public void MenuSecundario() {
	
	System.out.println("         COMICION  ");
	System.out.println("1. PUNTUALIDAD       = 10%");
	System.out.println("2. EDUCACION         = 20%");
	System.out.println("3. BUEN RENDIMIENTO  = 30% ");
	System.out.println("4. GUAPO O GUAPA     = 50%");
	System.out.println("5. REGRESAR AL MENU PRINCIPAL");
	System.out.println("INGRESE UNA OPCION");
	opc=sc.nextInt();
	do {
	switch (opc) {
	case 1:
		System.out.println("1. PUNTUALIDAD       = 10%");
		System.out.println("SE LE ADICIONARA A SU SUELDO UN 10%");
		//ingrese el sueldo
		System.out.println("INGRESE EL SUELDO ");
		suel=sc.nextInt();
		//calculo el porcentaje con el sueldo
		total=suel*0.1;
		System.out.println("SU COMISION DE ACUERDO A SU SUELDO ES DE  "+total);
		//realizo la suma del sueldo mas la comision del porcentaje
		comision=suel+total;
		System.out.println("SU SUELDO MAS LA COMISION ES DE "+comision);
		
		Menus();
		break;
	case 2:
		System.out.println("2. EDUCACION         = 20%");
		System.out.println("SE LE ADICIONARA A SU SUELDO UN 20%");
		//ingrese el sueldo
		System.out.println("INGRESE EL SUELDO DEL trabajador");
		suel=sc.nextInt();
		//res=20/100;
		//calculo el porcentaje con el sueldo
		total=suel*0.2;
		//realizo la suma del sueldo mas la comision del porcentaje
		comision=suel+total;
		System.out.println("SU SUELDO MAS LA COMISION ES DE "+comision);
		break;
	case 3:
		System.out.println("3. BUEN RENDIMIENTO  = 30% ");
		System.out.println("SE LE ADICIONARA A SU SUELDO UN 30%");
		//ingrese el sueldo
		System.out.println("INGRESE EL SUELDO DEL trabajador");
		suel=sc.nextInt();
		//res=30/100;
		//calculo el porcentaje con el sueldo
		total=suel*0.3;
		//realizo la suma del sueldo mas la comision del porcentaje
		comision=suel+total;
		System.out.println("SU SUELDO MAS LA COMISION ES DE "+comision);
		break;
	case 4:
		System.out.println("4. GUAPO O GUAPA     = 50%");
		System.out.println("SE LE ADICIONARA A SU SUELDO UN 50%");
		//ingrese el sueldo
		System.out.println("INGRESE EL SUELDO DEL trabajador");
		suel=sc.nextInt();
		//res=50/100;
		//calculo el porcentaje con el sueldo
		total=suel*0.5;
		//realizo la suma del sueldo mas la comision del porcentaje
		comision=suel+total;
		System.out.println("SU SUELDO MAS LA COMISION ES DE "+comision);
		break;
	case 5:
		System.out.println("5. REGRESAR AL MENU PRINCIPAL");
		Menus();
		break;
	default:
		System.out.println("OPCION INCORRECTA VUELVA A INGRESAR");
		MenuSecundario();
	}	
		
	}while (opc>4);
}



}
