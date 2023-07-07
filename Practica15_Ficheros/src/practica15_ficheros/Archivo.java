
package practica15_ficheros;
import java.io.*;

public class Archivo {
    ///crear archivo
    public static void crearArchivo(String nombreArchivo){
            File archivo=new File(nombreArchivo);
            try {
                PrintWriter salida =new PrintWriter(archivo);
                salida.close();
                System.out.println("         ARCHIVO CREADO");
            }catch (FileNotFoundException ex){
                ex.printStackTrace(System.out);
            }
        
        }
    //// escribir en archivo
       public static void escribirArchivo(String nombreArchivo, String contenido){
            File archivo=new File(nombreArchivo);
            try {
                PrintWriter salida =new PrintWriter(archivo);
                salida.println(" CONTENIDOO");
                salida.close();
                System.out.println(" ARCHIVO CREADO");
            }catch (FileNotFoundException ex){
                ex.printStackTrace(System.out);
            }
        
        }
//// leer archivo
          public static void LeerArchivo(String nombreArchivo) throws IOException{
            File archivo=new File(nombreArchivo);
            try {
                BufferedReader entrada =new BufferedReader(new FileReader(archivo));
                //comando readline recorre linea por line
                String lectura= entrada.readLine();
                while (lectura !=null){
                    System.out.println(lectura);
                     lectura= entrada.readLine();
                }
                entrada.close();
                //manejo de exepciones
            }catch (FileNotFoundException ex){
                ex.printStackTrace(System.out);
            }catch (IOException ex){
                ex.printStackTrace(System.out);
            }
        
        }
          ///borrar archivo
           public static void EliminarArchivo(String nombreArchivo) throws IOException{
            File archivo=new File(nombreArchivo);
            System.out.println(archivo.exists());
            archivo.delete();
            System.out.println(" ARCHIVO ELIMINADO/n");
          
        
        }
}
