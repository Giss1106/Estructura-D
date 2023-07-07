
package practica15_ficheros;
import java.io.IOException;
import java.util.Scanner;
public class MenuArchivo extends Archivo{
    int opc;
    
    public static void MenuArchivo (){
        System.out.println("    ");

    }
    public void Menu() throws IOException{
         
         do {
         Scanner sc=new Scanner(System.in);
         System.out.println("       MENU");
         System.out.println(" 1. CREAR ARCHIVO");
         System.out.println(" 2. ESCRIBIR ARCHIVO");
         System.out.println(" 3. LEER ARCHIVO");
         System.out.println(" 4. ELIMINAR ARCHIVO");
         System.out.println(" 5. SALIR DE MENU");
         System.out.println("INGRESE UNA OPCION: ");
         opc=sc.nextInt();
         switch(opc){
             case 1:
                 System.out.println(" HAS ELEJIDO LA PRIEMRA OPCION");
                 System.out.println(" A CONTINUACION SE CREARA EL ARCHIVO ");
                 Archivo.crearArchivo("miarchivo.txt");
                 Menu();
                 break;
             case 2:
                  System.out.println(" HAS ELEJIDO LA SEGUNDA OPCION");
                 System.out.println(" A CONTINUACION SE ESCRIBIRA  EL ARCHIVO ");
                 Archivo.escribirArchivo("miarchivo.txt", "HOLA MUNDO COMO ESTAN TODOS");
                 Menu();
                 break;
             case 3:
                  System.out.println(" HAS ELEJIDO LA TERCERA OPCION");
                 System.out.println(" A CONTINUACION SE LEERA EL ARCHIVO ");
                 Archivo.LeerArchivo("miarchivo.txt");
                 Menu();
                 break;
             case 4:
                  System.out.println(" HAS ELEJIDO LA CUARTA OPCION");
                 System.out.println(" A CONTINUACION SE ELIMINARA EL ARCHIVO ");
                 Archivo.EliminarArchivo("miarchivo.txt");
                 Menu();
                 break;
             case 5:
                 System.out.println(" HAS ELEJIDO LA QUINTA OPCION");
                 System.out.println(" GRACIAS POR SALIR ");
                 break;
             default :
                 System.out.println(" OPCION INCORRECTA");
         }
             
         }while(opc>5);
         
         
                }
    
    
}
