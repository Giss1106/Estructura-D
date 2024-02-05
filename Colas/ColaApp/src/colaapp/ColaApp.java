/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colaapp;
public class ColaApp {
    public static void main(String[] args) {
        Cola cola =new Cola(5);
        cola.insertar(10);
        cola.insertar(15);
        cola.insertar(20);
        cola.insertar(25);
        
        while(!cola.colavacia()){
            Object n=cola.quitar();
            System.out.println(n);
            System.out.println(" ");
            
        }
        cola.insertar("PERRO");
        cola.insertar("GATO");
        cola.insertar("CABALLO");
        cola.insertar("LEON");
        cola.insertar("TIGRE");
        System.out.println(" ");
        System.out.println("ELEMENTO EN LA CABEZA");
        System.out.println(cola.frentecola());
        System.out.println(" ");
        
        System.out.println("ESTA COLA VACIA?");
        System.out.println(cola.colavacia());
        System.out.println("ESTA COLA LLENA?");
        System.out.println(cola.colallena());
        System.out.println("TAMANO DE LA COLA?");
        System.out.println(cola.tamanocola());
        
        while(!cola.colavacia()){
            Object m= cola.quitar();
            System.out.println(m);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
